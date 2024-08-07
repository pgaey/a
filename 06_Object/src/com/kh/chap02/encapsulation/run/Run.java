package com.kh.chap02.encapsulation.run;

import com.kh.chap02.encapsulation.model.vo.Student;

public class Run {
	/*
	 * 캡슐화 과정을 통해 완벽한 클래스 형태를 갖추게 하자!!
	 * 
	 * 정보보안의 3요소 : 기밀성, 무결성, 가용성
	 * 
	 * 캡슐화를 진행하지 않으면 : 외부로부터 직접 접근이 가능하기 때문에 함부로 값이 변질되거나 조회할 수 있음
	 * 
	 * => 캡슐화 : 정보 은닉 기술 중 하나!
	 * 
	 * 데이터의 "접근제한"을 원칙으로 외부로부터 직접접근을 막는 방법!
	 * 
	 * => 캡슐화 작업의 2단계
	 * 1. 값을 숨긴다 : public에서 private으로 접근제한자를 바꿔준다.
	 * 
	 * 2. 간접적으로 값을 처리할 수 있는 메소드를 만든다.
	 * 
	 */

	// 접근제한자 (예약어) 반환형 메소드식별자(매개변수)
	public static void main(String[] args) {

		Student sim = new Student();
		/*
		sim.name = "심현정";
		sim.gender = 'F';
		sim.age = 20;

		System.out.println(sim.name);
		System.out.println(sim.gender);					
		System.out.println(sim.age);
		*/
		
		// 필드가 보이지 않아서 오류 발생!! => private으로 변경했기 때문에 직접접근이 불가 !!
		// 직접접근을 막았으니 간접적으로 접근할 수 있게끔 => getter / setter 메소드 만들기 !
		
		sim.setName("심현정");
		sim.setAge(20);
		sim.setGender('F');
		
//		System.out.println(sim.name);	// 되지 않음
		
		sim.getName();		// name 값이 돌아옴
		String sn = sim.getName();	// 값을 받을 변수를 만들어야함
		System.out.println(sn);
		
		sim.getAge();
		int simAge = sim.getAge();
		System.out.println(simAge);
		
		sim.getGender();
		char simGender = sim.getGender();
		System.out.println(simGender);
		
		System.out.println(sim.information());
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
