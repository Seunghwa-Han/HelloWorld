package com.example.lab1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main lab1 = new Main();
		lab1.a01();
	}
	
	public void a01() {
		System.out.println("Hello World!!!\n");
		Scanner s = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String name = s.next();
		System.out.println("["+name+"]님 환영합니다~~~");
	}

}
