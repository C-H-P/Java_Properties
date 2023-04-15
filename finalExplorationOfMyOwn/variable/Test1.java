public class Test1{
	public static final int x=1;
	public static void main(String[] args){
		//local variable takes precedence
		int x=1;
		//this output will be 1
		System.out.println(x++);
	}
}
