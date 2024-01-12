package com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {
    	Scanner s=new Scanner(System.in);
    	List<Friend> fList=new ArrayList<Friend>();
    	
    	System.out.println("친구를 3명 등록해 주세요");
    	Friend f01=new Friend(s.nextLine().split(" "));
    	Friend f02=new Friend(s.nextLine().split(" "));
    	Friend f03=new Friend(s.nextLine().split(" "));
    	
    	fList.add(f01);
    	fList.add(f02);
    	fList.add(f03);
    	
    	for(int i=0; i<fList.size(); i++) {
        	System.out.println(fList.get(i).toString());
    	}
    	s.close();
    }

}
