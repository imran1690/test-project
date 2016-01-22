package com.pack1;

public class C extends A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C cc = new C();
		//private members cannot be accessed from the inherited class
		//System.out.println(cc.aa);
		System.out.println(cc.b);
		System.out.println(cc.c);
		System.out.println(cc.d);
	}

}
