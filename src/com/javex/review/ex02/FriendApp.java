package com.javex.review.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {
		
		List<Friend> fList = new ArrayList<Friend>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("친구를 3명 등록해 주세요");
		
		for(int i=0; i<3; i++) {
			String str = sc.nextLine();
			String[] pInfo = str.split(" ");
			
			Friend friend = new Friend(pInfo[0], pInfo[1], pInfo[2]);
			fList.add(friend);
		}
		
		for(int i=0; i<fList.size(); i++) {
			fList.get(i).showInfo();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
