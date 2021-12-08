package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       String inputStr;
       
       String name;
       int price,count;
       
       Goods goods;
       List<Goods>gList = new ArrayList<>();
       
       System.out.println("상품을 입력해주세요(종료 q)");
       while(true) {
    	   inputStr = sc.nextLine();
    	   if(inputStr.equals("q")) {
    		   System.out.println("[입력완료]");
    		   System.out.println("=========================");
    		   listAllPrint(gList);
    		   break;
    	   }
    	   name = inputStr.split(",")[0];
    	   price = Integer.parseInt(inputStr.split(",")[1]);
    	   count = Integer.parseInt(inputStr.split(",")[2]);
    	   goods = new Goods(name,price,count);
    	   gList.add(goods);
       }
       
       sc.close();
    }

	private static void listAllPrint(List<Goods> gList) {
		int sum=0;
		for(Goods g : gList) {
			g.showInfo();
			sum += g.getCount();
		}
		
		System.out.println("모든 상품의 갯수는 "+sum+"개입니다.");
	}

}
