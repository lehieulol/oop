package Licht;

class Parent {
	public void print_1() {
		System.out.println("print_1...");
	}
	protected void print_2() {
		System.out.println("print_2...");
	}
	private void print_3() {
		System.out.println("print_3...");
	}
	public void methol() {
		System.out.println("PARENT METHOL");
	}
}

class Child extends Parent{
	public void print__1() {
		System.out.print("\t");
		print_1();
	}
	public void print__2() {
		System.out.print("\t");
		print_2();
	}
	public void methol() {
		System.out.println("CHILD METHOL");
	}
	public void smethol() {
		super.methol();
	}
	public void type(int a) {
		System.out.println("this is a int");
	}
	public void type(String a) {
		System.out.println("this is a String");
	}
	public void type(boolean a) {
		System.out.println("this is a boolean");
	}
	//this wil not work
	/*
	public void print__3() {
		print_3();
	}
	*/
}

public class Licht{
	public static void main(String[] args) {
		Child c = new Child();
		Parent p = new Parent();
		p.print_1();
		c.print__1();
		//this will not work. Oh no Java dont support protected :( . (protected = public)
		p.print_2();
		//child class can use parent class's methol. It's Inheritance
		c.print_2();
		c.print__2();
		//this will not work
		//p.print_3();
		//polymorphism runtime
		c.methol();
		p.methol();
		c.smethol();
		//compile time
		c.type(0);
		c.type(new String());
		c.type(true);
	}	
}