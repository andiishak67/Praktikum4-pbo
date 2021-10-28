import java.util.Scanner;

class Siswa{
	String nama;
	String jurusan;
	String nim;
		void setnama(String namasiswa)
		{
		nama=namasiswa;
		}
		void setjurusan(String jurusansiswa)
		{
		jurusan=jurusansiswa;
		}
		void setnim(String nimsiswa)
		{
		nim=nimsiswa;
		}
		void cetak(){
		System.out.println(" nama saya adalah : " + nama +
		"\n jurusan saya adalah : " + jurusan + "\n dan nim saya : " + nim);
		}
}		

public class Kampus{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	Siswa s;
	s = new Siswa();
	System.out.print("Masukkan nama = " );
	s.nama = input.nextLine();
	System.out.print("Masukkan jurusan = " );
	s.jurusan = input.nextLine();
	System.out.print("Masukkan nim = " );
	s.nim = input.nextLine();
	s.cetak();	
	}
}