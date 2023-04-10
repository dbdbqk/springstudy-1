package com.gdu.app01.xml01;

public class MainClass {

	public static void main(String[] args) {
		
		// Student haksaeng 객체를 만들고, haksaeng 객체가 가지고 있는 계산기 사용하기
		Student haksaeng = new Student();
		haksaeng.setCalculator(new Calculator());
		haksaeng.getCalculator().add(1, 2);
		haksaeng.getCalculator().sub(1, 2);
		haksaeng.getCalculator().mul(1, 2);
		haksaeng.getCalculator().div(1, 2);

	}

}
