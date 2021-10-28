class siswa
{
	String nama;
	String jurusan;
	int nrp;
}
public class contohObjek
	{
		public static void main(String[] args){
		siswa a = new siswa();
		a.nama = "Ishak";
		a.jurusan = "System informasi";
		a.nrp = 5021801;
		System.out.println("nama : " + a.nama + "jurusan : " + a.jurusan + "nim : " + a.nrp );	
		}
	}