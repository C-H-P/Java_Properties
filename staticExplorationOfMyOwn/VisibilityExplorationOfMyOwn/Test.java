public class Test{
	public static void main(String[] args){
		Sub sub=new Sub();
		sub.foo();
		Super su=new Sub();
		//This will return an error because foo has private access
		su.foo();	
	}
}
