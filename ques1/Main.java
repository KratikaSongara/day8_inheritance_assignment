package com.ques1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird b1 = new Parrot();
		b1.fly();
		
		Parrot parrot = (Parrot)b1;
		parrot.sing();
		//with this b1 reference call the fly method of
//		Parrot
		//and after downcasting this b1 reference to the
//		Parrot class object, call the sing method also
	}

}
