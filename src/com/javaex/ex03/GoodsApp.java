package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		List<Goods> gList=new ArrayList<Goods>();

		System.out.println("상품을 입력해 주세요(종료 q)");

		while(true) {
			String str=s.nextLine();
			
			if("q".equals(str)) {
				break;
			}
			
			Goods g00=new Goods(str.split(","));
			gList.add(g00);
		}
		
		System.out.println("[입력완료]");
		System.out.println("===========================");
		for(int i=0; i<gList.size(); i++) {
			System.out.println(gList.get(i).toString());
		}


	}

}
