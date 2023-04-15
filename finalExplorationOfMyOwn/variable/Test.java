public class Test{
	public static final int x=1;
	public static void main(String[] args){
		//final variable x cannot be modified 
		//This will return a compilation error
		System.out.println(x++);
	}
}
