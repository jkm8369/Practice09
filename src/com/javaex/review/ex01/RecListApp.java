package com.javaex.review.ex01;


import java.util.ArrayList;
import java.util.List;

public class RecListApp {

	public static void main(String[] args) {
		
		List<Rectangle> rList = new ArrayList<Rectangle>();
		Rectangle r01= new Rectangle(1, 1);
		Rectangle r02= new Rectangle(2, 2);
		Rectangle r03= new Rectangle(3, 3);
		Rectangle r04= new Rectangle(4, 5);
		
		rList.add(r01);
		rList.add(r02);
		rList.add(r03);
		rList.add(r04);
		
		System.out.println("#사각형 4개 리스트에 추가========================");
		
		for(int i=0; i<rList.size(); i++) {
			rList.get(i).draw();
		}
		
		System.out.println("#3번째 사각형(3,3) 삭제========================");
		rList.remove(r03);
		
		for(int i=0; i<rList.size(); i++) {
			rList.get(i).draw();
		}
		
		System.out.println("#4번째 사각형(4,5) --> (9,5)로 width 값 변경==========");
		r04.setWidth(9);
		
		for(int i=0; i<rList.size(); i++) {
			rList.get(i).draw();
		}
		
		double sum = 0;
		System.out.println("#모든 사각형의 넓이 합 출력===========================");
		
		for(int i=0; i<rList.size(); i++) {
			sum = sum + rList.get(i).area();

		}
		
		System.out.println("모든 사각형의 넓이는 " + sum + " 입니다.");
		
		
		

	}

}
