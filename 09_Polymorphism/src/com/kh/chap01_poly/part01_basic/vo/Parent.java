package com.kh.chap01_poly.part01_basic.vo;

public class Parent {
	// �ʵ��
	private int x;
	private int y;
	
	// �����ں�
	public Parent() {}
	public Parent(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// �޼ҵ��
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	
	public void printParent() {
		System.out.println("�� �θ�� ~ ");
	}
	
	public void print() {
		System.out.println("�� �θ�� ~");
	}
	
	
	
	
	
	
}