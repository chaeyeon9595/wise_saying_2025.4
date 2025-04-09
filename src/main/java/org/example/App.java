package org.example;

import java.util.*;

public class App {

    private Scanner sc; //앱의 sc

    App(Scanner sc){
        this.sc = sc; //main에서 가져온 sc
    }



    public void run(){
        System.out.println("== motivation 앱 실행 == ");

        int lastId = 1;
        List<WiseSaying> wiseSayingList = new ArrayList<>(); //WiseSaying a = new WiseSaying(); 에서 List로 받기...

        while(true){


            System.out.print("명령어) ");
            String cmd = sc.nextLine().trim(); //앱이 가진 sc를 사용. trim -> 혹시 모를 좌우 공백 제거

            if(cmd.equals("add")){
                System.out.print("명언 : ");
                String content = sc.nextLine();
                System.out.print("인물 : ");
                String person = sc.nextLine();
                System.out.printf("%d번 명언이 등록되었습니다.\n", lastId);

                WiseSaying temp = new WiseSaying(lastId, content, person);
                wiseSayingList.add(temp);


                lastId++;



            }
            else if(cmd.equals("list")){

                if(wiseSayingList.size() == 0){
                    System.out.println("등록된 명언이 없습니다."); //등록된 명언이 없다? 사이즈 체크
                }
                else {
                    System.out.println("번호    /    인물    /    명언");
                   // System.out.printf("%d     %s    %s", wiseSayingList.get(0).getId(), wiseSayingList.get(0).getPerson()); -> 이렇게는 0,1,2,3 ... 계속 가야함..
                    System.out.println("=" .repeat(30));
                    Collections.reverse(wiseSayingList);
                    //순서 거꾸로 뒤집어주기

                    for(WiseSaying temp : wiseSayingList){
                        System.out.printf("%d         %s      %s\n", temp.getId(), temp.getPerson(), temp.getContent());
                    }
                }
            }

            else if(cmd.equals("exit")){ //equals로 내용비교. 그냥 == 으로 비교하면 주소값을 비교하는 것!!
                System.out.println("== motivation 앱 종료 ==");
                break;
            }
            else {
                System.out.println("존재하지 않는 명령어입니다.");
            }
        }

    }

}
