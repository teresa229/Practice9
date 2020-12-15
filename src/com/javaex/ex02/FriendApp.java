package com.javaex.ex02;

import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {
    	
    	
    	Friend[] friendArray = new Friend[3];
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("친구를 3명 등록해 주세요");
    	
    	for(int i=0; i<friendArray.length; i++) {
    		String line = sc.nextLine();
    		String[] data = line.split("");
    		
    		//Friend 객체 생성하여 데이터 넣기
    		Friend friend = new Friend();
    		friend.setName(data[0]);
    		friend.setHp(data[1]);
    		friend.setSchool(data[2]);
    		
    		//배열에 추가하기
    		friendArray[i] = friend;
    	}
    	
    		//친구정보 출력
    	for(int i =0; i<friendArray.length; i++) {
    		friendArray[i].showInfo();
    	}
    	sc.close();
    }

}
