package Module1_Java;

 class Methods {
	public static void method1()
	{
	System.out.println("my first method");	
	}
public int addition()
{
	int a=10;
	int b=23;
	int c=a+b;
	System.out.println(c);
	return c;
}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods obj=new Methods();
		obj.method1();
		obj.addition();
		

	}

}
