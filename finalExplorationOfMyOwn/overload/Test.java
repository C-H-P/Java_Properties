public class Test{
	public static final void foo(){
		System.out.println("Foo with no parameters");
	}
	public static final void foo(String s){
		
		System.out.println("Foo with a parameter "+s);
	}
	public static void main(String[] args){
		foo();
		foo("hello");	
	}
}
