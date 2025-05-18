package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	
    	List<Goods> goodsList = new ArrayList<Goods>();
    	
    	int allGoodsCount = 0;
    	
    	System.out.println("상품을 입력해주세요(종료 q)");
    	
    	while(true) {
    		String str = sc.nextLine();
    		
    		if(str.equals("q")) {
    			System.out.println("[입력완료]");
    			System.out.println("==================");
    			break;
    		}
    		
    		String[] goodsInfo = str.split(",");
    		String name = goodsInfo[0];
    		int price = Integer.parseInt(goodsInfo[1]);
    		int count = Integer.parseInt(goodsInfo[2]);
    		
    		Goods goods = new Goods(name, price, count);
    		
    		goodsList.add(goods);
    		
    	}
    	
    	for(int i=0; i<goodsList.size(); i++) {
    		goodsList.get(i).showInfo();
    	}
    	
    	for(int i=0; i<goodsList.size(); i++) {
    		allGoodsCount = allGoodsCount + goodsList.get(i).getCount();
    	}
    	
    	System.out.println("모든 상품의 갯수는 " + allGoodsCount + "개 입니다.");
    	
    	
       sc.close();
    }

}
