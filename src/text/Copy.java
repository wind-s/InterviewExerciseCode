package text;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Copy {

    public static void main(String[] args) {
        for(int i=1; i<20; i++){
            String day = i+"";
            if(i<10){
                day = "0"+i;
            }
            String date = "2019-07-"+day+" 00:00:00";
            System.out.println("INSERT INTO `scrm_server`.`nursing_situation`(`app_type`, `account_id`, `confirm_date`, `status`, `sub_status`, `create_time`, `detail`) VALUES ('DOUYIN', '1002071275', '"+date+"', 'WORKING', 'AVAILABLE_NORMAL', now(), NULL);");
            System.out.println("INSERT INTO `scrm_server`.`nursing_situation`(`app_type`, `account_id`, `confirm_date`, `status`, `sub_status`, `create_time`, `detail`) VALUES ('DOUYIN', '111340455', '"+date+"', 'WORKING', 'AVAILABLE_NORMAL', now(), NULL);");
            System.out.println("INSERT INTO `scrm_server`.`nursing_situation`(`app_type`, `account_id`, `confirm_date`, `status`, `sub_status`, `create_time`, `detail`) VALUES ('DOUYIN', '1291383867', '"+date+"', 'WORKING', 'AVAILABLE_NORMAL', now(), NULL);");
            System.out.println("INSERT INTO `scrm_server`.`nursing_situation`(`app_type`, `account_id`, `confirm_date`, `status`, `sub_status`, `create_time`, `detail`) VALUES ('DOUYIN', '2244696192', '"+date+"', 'WORKING', 'AVAILABLE_NORMAL', now(), NULL);");
            System.out.println("INSERT INTO `scrm_server`.`nursing_situation`(`app_type`, `account_id`, `confirm_date`, `status`, `sub_status`, `create_time`, `detail`) VALUES ('DOUYIN', '2248743277', '"+date+"', 'WORKING', 'AVAILABLE_NORMAL', now(), NULL);");
            System.out.println("INSERT INTO `scrm_server`.`nursing_situation`(`app_type`, `account_id`, `confirm_date`, `status`, `sub_status`, `create_time`, `detail`) VALUES ('DOUYIN', '2252013195', '"+date+"', 'WORKING', 'AVAILABLE_NORMAL', now(), NULL);");
            System.out.println("INSERT INTO `scrm_server`.`nursing_situation`(`app_type`, `account_id`, `confirm_date`, `status`, `sub_status`, `create_time`, `detail`) VALUES ('DOUYIN', '2255978031', '"+date+"', 'WORKING', 'AVAILABLE_NORMAL', now(), NULL);");
            System.out.println("INSERT INTO `scrm_server`.`nursing_situation`(`app_type`, `account_id`, `confirm_date`, `status`, `sub_status`, `create_time`, `detail`) VALUES ('DOUYIN', '2258669667', '"+date+"', 'WORKING', 'AVAILABLE_NORMAL', now(), NULL);");
            System.out.println("INSERT INTO `scrm_server`.`nursing_situation`(`app_type`, `account_id`, `confirm_date`, `status`, `sub_status`, `create_time`, `detail`) VALUES ('DOUYIN', '2258671998', '"+date+"', 'WORKING', 'AVAILABLE_NORMAL', now(), NULL);");
            System.out.println("INSERT INTO `scrm_server`.`nursing_situation`(`app_type`, `account_id`, `confirm_date`, `status`, `sub_status`, `create_time`, `detail`) VALUES ('DOUYIN', '2269501644', '"+date+"', 'WORKING', 'AVAILABLE_NORMAL', now(), NULL);");
            System.out.println("INSERT INTO `scrm_server`.`nursing_situation`(`app_type`, `account_id`, `confirm_date`, `status`, `sub_status`, `create_time`, `detail`) VALUES ('DOUYIN', '2269504352', '"+date+"', 'WORKING', 'AVAILABLE_NORMAL', now(), NULL);");
            System.out.println("INSERT INTO `scrm_server`.`nursing_situation`(`app_type`, `account_id`, `confirm_date`, `status`, `sub_status`, `create_time`, `detail`) VALUES ('DOUYIN', '2269506483', '"+date+"', 'WORKING', 'AVAILABLE_NORMAL', now(), NULL);");
            System.out.println("INSERT INTO `scrm_server`.`nursing_situation`(`app_type`, `account_id`, `confirm_date`, `status`, `sub_status`, `create_time`, `detail`) VALUES ('DOUYIN', '2307421031', '"+date+"', 'WORKING', 'AVAILABLE_NORMAL', now(), NULL);");
            System.out.println("INSERT INTO `scrm_server`.`nursing_situation`(`app_type`, `account_id`, `confirm_date`, `status`, `sub_status`, `create_time`, `detail`) VALUES ('DOUYIN', '2312600874', '"+date+"', 'WORKING', 'AVAILABLE_NORMAL', now(), NULL);");
            System.out.println("INSERT INTO `scrm_server`.`nursing_situation`(`app_type`, `account_id`, `confirm_date`, `status`, `sub_status`, `create_time`, `detail`) VALUES ('DOUYIN', '2312603178', '"+date+"', 'WORKING', 'AVAILABLE_NORMAL', now(), NULL);");
            System.out.println("INSERT INTO `scrm_server`.`nursing_situation`(`app_type`, `account_id`, `confirm_date`, `status`, `sub_status`, `create_time`, `detail`) VALUES ('DOUYIN', '2312606797', '"+date+"', 'WORKING', 'AVAILABLE_NORMAL', now(), NULL);");
            System.out.println("INSERT INTO `scrm_server`.`nursing_situation`(`app_type`, `account_id`, `confirm_date`, `status`, `sub_status`, `create_time`, `detail`) VALUES ('DOUYIN', '2312610941', '"+date+"', 'WORKING', 'AVAILABLE_NORMAL', now(), NULL);");
            System.out.println("INSERT INTO `scrm_server`.`nursing_situation`(`app_type`, `account_id`, `confirm_date`, `status`, `sub_status`, `create_time`, `detail`) VALUES ('DOUYIN', '2312612986', '"+date+"', 'WORKING', 'AVAILABLE_NORMAL', now(), NULL);");
            System.out.println("INSERT INTO `scrm_server`.`nursing_situation`(`app_type`, `account_id`, `confirm_date`, `status`, `sub_status`, `create_time`, `detail`) VALUES ('DOUYIN', '2312614622', '"+date+"', 'WORKING', 'AVAILABLE_NORMAL', now(), NULL);");
            System.out.println("INSERT INTO `scrm_server`.`nursing_situation`(`app_type`, `account_id`, `confirm_date`, `status`, `sub_status`, `create_time`, `detail`) VALUES ('DOUYIN', '2312615857', '"+date+"', 'WORKING', 'AVAILABLE_NORMAL', now(), NULL);");
            System.out.println("INSERT INTO `scrm_server`.`nursing_situation`(`app_type`, `account_id`, `confirm_date`, `status`, `sub_status`, `create_time`, `detail`) VALUES ('DOUYIN', '2314469103', '"+date+"', 'WORKING', 'AVAILABLE_NORMAL', now(), NULL);");
            System.out.println("INSERT INTO `scrm_server`.`nursing_situation`(`app_type`, `account_id`, `confirm_date`, `status`, `sub_status`, `create_time`, `detail`) VALUES ('DOUYIN', '2314476145', '"+date+"', 'WORKING', 'AVAILABLE_NORMAL', now(), NULL);");
            System.out.println("INSERT INTO `scrm_server`.`nursing_situation`(`app_type`, `account_id`, `confirm_date`, `status`, `sub_status`, `create_time`, `detail`) VALUES ('DOUYIN', '2316882334', '"+date+"', 'WORKING', 'AVAILABLE_NORMAL', now(), NULL);");
            System.out.println("INSERT INTO `scrm_server`.`nursing_situation`(`app_type`, `account_id`, `confirm_date`, `status`, `sub_status`, `create_time`, `detail`) VALUES ('DOUYIN', '2316889099', '"+date+"', 'WORKING', 'AVAILABLE_NORMAL', now(), NULL);");
            System.out.println("INSERT INTO `scrm_server`.`nursing_situation`(`app_type`, `account_id`, `confirm_date`, `status`, `sub_status`, `create_time`, `detail`) VALUES ('DOUYIN', '2316892865', '"+date+"', 'WORKING', 'AVAILABLE_NORMAL', now(), NULL);");
            System.out.println("INSERT INTO `scrm_server`.`nursing_situation`(`app_type`, `account_id`, `confirm_date`, `status`, `sub_status`, `create_time`, `detail`) VALUES ('DOUYIN', '2316897522', '"+date+"', 'WORKING', 'AVAILABLE_NORMAL', now(), NULL);");
            System.out.println("INSERT INTO `scrm_server`.`nursing_situation`(`app_type`, `account_id`, `confirm_date`, `status`, `sub_status`, `create_time`, `detail`) VALUES ('DOUYIN', '2320605216', '"+date+"', 'WORKING', 'AVAILABLE_NORMAL', now(), NULL);");
            System.out.println("INSERT INTO `scrm_server`.`nursing_situation`(`app_type`, `account_id`, `confirm_date`, `status`, `sub_status`, `create_time`, `detail`) VALUES ('DOUYIN', '2320767299', '"+date+"', 'WORKING', 'AVAILABLE_NORMAL', now(), NULL);");
            System.out.println("INSERT INTO `scrm_server`.`nursing_situation`(`app_type`, `account_id`, `confirm_date`, `status`, `sub_status`, `create_time`, `detail`) VALUES ('DOUYIN', '2320784705', '"+date+"', 'WORKING', 'AVAILABLE_NORMAL', now(), NULL);");
            System.out.println("INSERT INTO `scrm_server`.`nursing_situation`(`app_type`, `account_id`, `confirm_date`, `status`, `sub_status`, `create_time`, `detail`) VALUES ('DOUYIN', '2320924125', '"+date+"', 'WORKING', 'AVAILABLE_NORMAL', now(), NULL);");
            System.out.println("INSERT INTO `scrm_server`.`nursing_situation`(`app_type`, `account_id`, `confirm_date`, `status`, `sub_status`, `create_time`, `detail`) VALUES ('DOUYIN', '2321000062', '"+date+"', 'WORKING', 'AVAILABLE_NORMAL', now(), NULL);");
            System.out.println("INSERT INTO `scrm_server`.`nursing_situation`(`app_type`, `account_id`, `confirm_date`, `status`, `sub_status`, `create_time`, `detail`) VALUES ('DOUYIN', '2321034467', '"+date+"', 'WORKING', 'AVAILABLE_NORMAL', now(), NULL);");
            System.out.println("INSERT INTO `scrm_server`.`nursing_situation`(`app_type`, `account_id`, `confirm_date`, `status`, `sub_status`, `create_time`, `detail`) VALUES ('DOUYIN', '2324591228', '"+date+"', 'WORKING', 'AVAILABLE_NORMAL', now(), NULL);");
            System.out.println("INSERT INTO `scrm_server`.`nursing_situation`(`app_type`, `account_id`, `confirm_date`, `status`, `sub_status`, `create_time`, `detail`) VALUES ('DOUYIN', '2324594584', '"+date+"', 'WORKING', 'AVAILABLE_NORMAL', now(), NULL);");
            System.out.println("INSERT INTO `scrm_server`.`nursing_situation`(`app_type`, `account_id`, `confirm_date`, `status`, `sub_status`, `create_time`, `detail`) VALUES ('DOUYIN', '2324662652', '"+date+"', 'WORKING', 'AVAILABLE_NORMAL', now(), NULL);");
            System.out.println("INSERT INTO `scrm_server`.`nursing_situation`(`app_type`, `account_id`, `confirm_date`, `status`, `sub_status`, `create_time`, `detail`) VALUES ('DOUYIN', '2324740225', '"+date+"', 'WORKING', 'AVAILABLE_NORMAL', now(), NULL);");
            System.out.println("INSERT INTO `scrm_server`.`nursing_situation`(`app_type`, `account_id`, `confirm_date`, `status`, `sub_status`, `create_time`, `detail`) VALUES ('DOUYIN', '2324794556', '"+date+"', 'WORKING', 'AVAILABLE_NORMAL', now(), NULL);");
            System.out.println("INSERT INTO `scrm_server`.`nursing_situation`(`app_type`, `account_id`, `confirm_date`, `status`, `sub_status`, `create_time`, `detail`) VALUES ('DOUYIN', '2324801852', '"+date+"', 'WORKING', 'AVAILABLE_NORMAL', now(), NULL);");
            System.out.println("INSERT INTO `scrm_server`.`nursing_situation`(`app_type`, `account_id`, `confirm_date`, `status`, `sub_status`, `create_time`, `detail`) VALUES ('DOUYIN', '2329337514', '"+date+"', 'WORKING', 'AVAILABLE_NORMAL', now(), NULL);");
            System.out.println("INSERT INTO `scrm_server`.`nursing_situation`(`app_type`, `account_id`, `confirm_date`, `status`, `sub_status`, `create_time`, `detail`) VALUES ('DOUYIN', '232935570', '"+date+"', 'WORKING', 'AVAILABLE_NORMAL', now(), NULL);");
            System.out.println("INSERT INTO `scrm_server`.`nursing_situation`(`app_type`, `account_id`, `confirm_date`, `status`, `sub_status`, `create_time`, `detail`) VALUES ('DOUYIN', '2329370525', '"+date+"', 'WORKING', 'AVAILABLE_NORMAL', now(), NULL);");
            System.out.println("INSERT INTO `scrm_server`.`nursing_situation`(`app_type`, `account_id`, `confirm_date`, `status`, `sub_status`, `create_time`, `detail`) VALUES ('DOUYIN', '2329378594', '"+date+"', 'WORKING', 'AVAILABLE_NORMAL', now(), NULL);");
        }
    }
}
