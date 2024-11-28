package test;

class A extends RuntimeException{	}
class B extends RuntimeException{	}
class C extends RuntimeException{	}
class D extends RuntimeException{	}

class Person{
	public void print( ) throws A, B, C{
		System.out.println("Inside super class");
	}
}
class Employee extends Person{
	@Override
	public void print( )throws A, B, C, D{
		System.out.println("Inside Sub class");
	}
}
public class Program {
	public static void main(String[] args) {
		try {
			Person p = new Employee();
			p.print();
		} catch (A | B | C e) {
			e.printStackTrace();
		}
	}
}
