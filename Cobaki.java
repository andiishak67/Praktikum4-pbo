class coba5{
	static int x=10, y=20;
}
public class Cobaki{
	public static void main(String args[]){
	coba5 a=new coba5( );	
	coba5 b=new coba5( );	
	System.out.println(a.x);
	System.out.println(a.y);
	b.x=25;
	b.y=55;
	System.out.println(a.x);
	System.out.println(a.y);
	}
}