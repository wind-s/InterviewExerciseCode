package juc;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * volatile
 *
 * @author winds 2019.08.29
 */
public class VolatileDemo {
    public static void main(String[] args) {
        //seeOk();
        seeAtomic();
    }

    /**
     * 验证可见性
     */
    public static void seeOk(){
        MyClass demo = new MyClass();
        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+" comming");
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            demo.setValue(100);
            System.out.println(Thread.currentThread().getName()+" update date");
        }, "AAA").start();

        while(demo.value == 0){
            System.out.println("线程修改，没有使用volatile, 不保证可见性");
        }
        System.out.println("demo value is not 0");
    }

    /**
     * 验证原子性，20个线程，每个线程++1000次，看最终结果是否为20000。结果是不等于20000
     */
    public static void seeAtomic(){
        MyClass demo = new MyClass();
        for (int i = 0; i < 20; i++) {
            new Thread(()->{
                for (int j = 0; j < 1000; j++) {
                    demo.plusValue();
                    demo.plusNum();

                }
            }, String.valueOf(i)).start();
        }
        // 活跃线程有两个，一个是主线程，一个是gc线程，如果>2, 说明上面的子线程还没执行完。
        while (Thread.activeCount() > 2){
            // 如果有未执行完的线程，主线程让出资源
            Thread.yield();
        }

        System.out.println("final result value:" + demo.value);
        System.out.println("final result value:" + demo.atomicInteger);
    }


}

/**
 * 1. value 没有volatile修饰，不存在可见性。
 * 2. 添加volatile, 解决可见性问题。
 * 3. volatile不保证原子性
 */
class MyClass{
    public volatile int value=0;

    volatile AtomicInteger atomicInteger = new AtomicInteger();

    public void plusNum(){
        atomicInteger.getAndIncrement();
    }

    public void setValue(int value ){
        this.value = value;
    }

    public void plusValue(){
        value++;
    }
}
