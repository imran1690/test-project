public class StaticMembersExample {
	
	int a = 12;
	static int staticB = 10;
	
	void nonStaticMethod()
	{
		System.out.println("Inside Non static method");
	}
	
	static void StaticMethod()
	{
		System.out.println("Inside static method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticMembersExample s = new StaticMembersExample(); 
		
		//non static members are accessed through the reference of the object created of that class
		System.out.println(s.a);
		//static members can be directly accessed in the static method of that class
		System.out.println(staticB);
		//non static methods are called through creating the object and calling it using that object
		s.nonStaticMethod();
		//static methods can be directly called in a static methods
		StaticMethod();

	}

}
