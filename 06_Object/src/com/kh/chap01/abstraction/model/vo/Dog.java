package com.kh.chap01.abstraction.model.vo;

/*
 * public class 클래스이름{
 * 
 * 		// 필드부
 * 
 * 		// 생성자부
 * 
 * 		// 메소드부
 * }
 * 
 */

public class Dog {
	
	// [ 필드부  ]
	// 접근제한자 자료형 필드이름;
	
	// 접근제한자 : 이 필드에 접근할 수 있는 범위를 제한할 수 있음
	//				public > protected > default > private
	// 클래스 안에서 필드를 선언할 때는 반드시 접근제한자를 붙일 것
	
	// 이름, 종, 성별, 나이, 주인, 몸무게
	public String name;
	public String breed;
	public String gender;
	public int age;
	public String owner;
	public int weight;
	
	// [ 생성자부  ]
	
	
	
	
	// [ 메소드부  ]  // class안에 있는 함수를 메소드라고 부름
	public void bow() {
		System.out.println(name + "이가 멍멍하고 짖습니다.");
	}
	
	public void eat(int kg) {
		if(weight <= 100) {
			weight += kg;
		} else {
			System.out.println("안먹어~ 배불러 ~");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
