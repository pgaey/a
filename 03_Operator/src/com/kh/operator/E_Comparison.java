package com.kh.operator;

public class E_Comparison {

	/*
	 * 비교 연산자(관계연산자)        의문문으로 생각하는 것이 좋음
	 * 
	 * 두 개의 값을 가지고 비교, 이항 연산자
	 * 비교연산을 한 결과 -> 참일 경우 true, 거짓일 경우 false
	 * 특정 조건을 제시할 수 있는 조건문에서 사용할 예정!!
	 */
	
	/*
	 * 종류
	 * 
	 * 1. 대소비교  : 코그 작음을 비교
	 * 
	 * a < b : a가 b보다 작습니까?
	 * a > b : a가 b보다 큽니까?
	 * a <= b : a가 b보다 작거나 같습니까?
	 * a >= b : a가 b보다 크거나 같습니까?
	 * 
	 * 2. 동등비교  : 일치함을 비교
	 * 
	 * a == b : a와 b가 일치합니까?
	 * a != b : a와 b가 일치하지 않습니까?
	 * 
	 * => 피연산자는 숫자, 결과값은 논리값
	 */
	
	public void method1() {
		
		int a = 10;
		int b = 25;
		
		System.out.println("a < b : " + (a < b)); // 1. true
		
		System.out.println("25 <= b : " + (25 <= b)); // 2. true
		
		System.out.println("a == b : " + (a == b)); // 3. false
		
		boolean result = a != b;
		System.out.println(result); // 4. true
		
		System.out.println("a - b < 0 : " + (a - b < 0)); // 5. true
		
		boolean result1 = (a % 2 == 0);
		boolean result2 = (b % 2 != 0);
		System.out.println("a가 짝수입니까? : " + result1);		// 6. true
		System.out.println("b가 짝수가 아닙니까? : " + (b % 2 != 0));		// 7. true
		System.out.printf("b가 짝수가 아닙니까? : \n%b", !result2); // 8. false
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
