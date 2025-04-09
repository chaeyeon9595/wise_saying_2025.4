package org.example;

import java.util.Scanner;

public class App {

    private Scanner sc; //앱의 sc

    App(Scanner sc){
        this.sc = sc; //main에서 가져온 sc
    }



    public void run(){
        System.out.println("== motivation 앱 실행 == ");

        System.out.print("명령어) ");
        String cmd = sc.nextLine().trim(); //앱이 가진 sc를 사용. trim -> 혹시 모를 좌우 공백 제거

        if(cmd.equals("exit")){ //equals로 내용비교. 그냥 == 으로 비교하면 주소값을 비교하는 것!!
            System.out.println("== motivation 앱 종료 ==");
        }

    }

}
