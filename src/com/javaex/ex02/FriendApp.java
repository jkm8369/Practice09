package com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class FriendApp {

    public static void main(String[] args) {

    	List<Friend> fList = new ArrayList<Friend>();
    	
		
    	Scanner sc = new Scanner(System.in);
    	System.out.println("친구 3명을 등록해주세요");
    	
    	
    	while(true) {
    		String fInfo = sc.nextLine();
    		
    		String[] str = fInfo.split(" ");
    		
    		Friend friend = new Friend(str[0], str[1], str[2]);
    		
    		if(fInfo == null) {
    			break;
    		}
    		fList.add(friend);
    		
    	}
    	
    	for(int i=0; i<fList.size(); i++) {
    		System.out.println(fList.get(i).toString());
    	}
    	

    	sc.close();
    	
    }

}
