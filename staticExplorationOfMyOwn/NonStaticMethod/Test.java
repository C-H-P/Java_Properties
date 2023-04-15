public class Test{
	public static void staticMethod(){
		System.out.println("This is a static method");

	}
	public void nonStatic(){
		//This will not work since nonStatic is not static and staticMethod() is static
		staticMethod();
	}
	public static void main(String[] args){
		nonStatic();	
	}
}
