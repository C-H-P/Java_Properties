public class Test{
	public static void main(String[] args){
		Super su=new Sub();
		su.foo();
		
		Super sup=new Super();
		Sub sub=(Sub)sup;		
	}
}
