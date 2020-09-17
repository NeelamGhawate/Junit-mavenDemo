package com.ngtech.SingletonPattern;

public class MySingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MySingleton mc1= MySingleton.getInstance();
		MySingleton mc2= MySingleton.getInstance();
		MySingleton mc3= MySingleton.getInstance();
		
		System.out.println("Ref:" + mc1.hashCode());
		System.out.println("Ref:" + mc2.hashCode());
		System.out.println("Ref:" + mc3.hashCode());

	}

}
