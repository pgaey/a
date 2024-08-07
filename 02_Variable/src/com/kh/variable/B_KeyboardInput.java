package com.kh.variable;

import java.util.Scanner;

public class B_KeyboardInput {

	/*
	 * 키보드를 이용해서 사용자에게 입력값을 받아보자
	 * System.in
	 * 자바에서 이미 제공하고 있는 Scanner라는 클래스를 사용할것!
	 * Scanner 클래스에 존재하고 있는 메소드들을 호출해서 사용
	 */
	
	public void inputTest() {
		
		Scanner sc = new Scanner(System.in);
		// System.in : 입력받은 값들을 받아들이겠다.(바이트단위로)
		
		// 사용자의 인적사항을 입력받아 출력해보자!
		
		// 입력받고자 하는 내용을 먼저 질문해서 입력을 유도
		
		System.out.println("이름이 어떻게 되세요? : ");
		
		// 사용자가 입력한 값을 문자열로 받아오는 메소드
		// nextLine(), next()
		// nextLine() : 사용자가 입력한 값 중 공백과 무관하게 한 문장을 다 읽어옴 개행문자를 만나기 전까지 (\n의 영향을 받음)
		String name = sc.next();   // 1.String name  2.sc.next(); 3.= 순서로 작동
		System.out.println(name + "님 안녕하세요!");
		
		// nextInt()		정수값
		// nextDouble()		실수값
		System.out.println("나이가 어떻게 되세요? :");
		int age = sc.nextInt();					// 입력을 하고 엔터를 누르면 int값과 \n(엔터)가 함께 입력되는 셈 . buffer에서 Ram으로 넘어가면서 int값만 옮겨지고 \n이 남음
		System.out.println(age + "살 이시네요!");		
		
		System.out.println("키는 어떻게 되세요? : ");
		double height = sc.nextDouble();
		System.out.println(height + "cm 시군요!");
		
		// nextchar 같은건 없음
		
		
		// nextLine() : 버퍼에서 개행문자(\n) 이전까지의 모든 값을 가져온 후 "개행문자"를 바꿔주는 역할      ,    개행문자 (\n)에 유일하게 영향을 받음
		sc.nextLine();		// 남아있는 \n을 날려주기 위함
		System.out.println("주소는 어떻게 되세요? : ");
		String address = sc.nextLine();		
		// next() : 사용자가 입력한 값 중 공백이 있을 경우 공백 이전까지만 입력을 받음
		System.out.println("주소 : " + address);		
		
		
		
	}
	
	
}
