package SettingNameToThreads;

public class A extends Thread{
	String name;
	A(String name){
		this.name=name;
	}
	public static void main(String[] args) {
		A a1= new A("KRISHNA");
		A a2= new A("Keshav");
	//defaultName is Thread-0,and Thread-2
		
		a1.setName("Krishna");
		a2.setName("Keshav");
		System.out.println(a1.getName());
		System.out.println(a2.getName());
		
	}

}
