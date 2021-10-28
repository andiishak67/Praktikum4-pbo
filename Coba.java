class coba4{
static int pencacah=0;
int nilai;

coba4(int nilai){
this.nilai=nilai;
this.pencacah++;
}

public void info(){
System.out.println(this.nilai);
System.out.println(this.pencacah);
}
}

public class Coba{
	public static void main(String args[]){
	coba4 a=new coba4(4);
	a.info();
		coba4 b=new coba4(5);
	b.info();
		coba4 c=new coba4(6);
	c.info();	
	}
}