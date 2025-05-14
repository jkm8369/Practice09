package com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class FriendApp {

    public static void main(String[] args) {

    	List<Friend> fList = new ArrayList<Friend>();
    	Friend friend = new Friend();
		
    	Scanner sc = new Scanner(System.in);
    	System.out.println("친구 3명을 등록해주세요");
    	String friendInfo;
    	
    	for(int i=0; i<fList.size(); i++) {
    		friendInfo = sc.nextLine();
    		Friend f01 = new Friend();
    		Friend f02 = new Friend();
    		Friend f03 = new Friend();
    		
    		fList.add(f01);
    		fList.add(f02);
    		fList.add(f03);
    		
    		fList[i] = friendInfo;
    		
    		
    		
    	}
    	
    	for(int i=0; i<fList.size(); i++) {
    		
    	}
    	

    	
    	sc.close();
    }

}
