package com.kh.chap04.model.vo;
/*
 * �ʵ�(field) : Ŭ������ �����ϴ� ��� �� �ϳ�!  = �������, �ν��Ͻ�����
 * 			  	�����͸� �����ϱ� ���� ����(����!)
 * 				Ŭ���� �������� �޼ҵ� �� ������ ������
 * 				
 * ���� ����
 * - field : Ŭ���� ������ �ٷ� �����ϴ� ����!
 * - local variable (= ��������) : Ŭ���� �������� Ư���� ����({}) => method, for�� ���..
 * 															for(int i = 0; <- �ʱ��){}
 * 
 * 1. ���� ������ ������ �ϴ� ģ��
 * 
 * - Ŭ���� ���� (static) : static�̶�� ���� ���� ����
 * 						�������� : ���α׷� ���۰� ���ÿ� static ������ �Ҵ��		// ���ʿ� �޸𸮿� �Ҵ�Ǵ� ������ �ٸ�
 * 						=> �ش� ��ü�� �������� �ʴ��� ������ ���α׷� ����� ���ÿ� �Ҵ�
 * 						�Ҹ���� : ���α׷��� ���� �� �Ҹ�						// �̷� �ǹ̿��� ����������� �ϴ� ����� ����
 * 						
 * 
 * 
 * - ��� ����(field(�ʵ�), �ν��Ͻ� ����) : 
 * 							�������� : new Ű���带 ����ؼ� �ش� ��ü�� �����ϴ� ���� �޸� ������ �Ҵ�  // field�� heap������ �ö�
 * 							�Ҹ���� : ��ü�� �Ҹ�� �� => Garbage Collector
 * 													���� : OOM(Out Of Memory)�� �߻���
 * 
 * 2. ��������
 * 							�������� : Ư���� ����({})�� ���� �� �޸� ������ �Ҵ� => stack����!
 * 							�Ҹ���� : Ư���� ����({})���� �� �Ҹ�
 */

public class FieldTest1 {
	
	
	// �ʵ�(�������, �ν��ͽ� ����)
	public int global;
	
	public void testVariable(int num/*(int num)�� �Ű����� = ��������*/) {		// test�޼ҵ� ����
		// ���������� ����غ���!
		
//		int local; // ��������   => �ݵ�� �ʱ�ȭ
//		
//		System.out.println(local);	// (local) ������ -> �ʱ�ȭ ���ؼ� !!  -> �������� : �ݵ�� �ʱ�ȭ�� �������!!
		
		int local = 1;
		
		System.out.println(global);	// �ʵ�, �������
		System.out.println(local);	// ��������
		System.out.println(num);	// �Ű�����
		
	} // �׽�Ʈ �޼ҵ� ���� ��
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}