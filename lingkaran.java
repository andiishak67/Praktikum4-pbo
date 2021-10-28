import java.util.Scanner;

class Lingkaran{
		double phi=3.14;
		double jari;
		double luas;
}
public class lingkaran{
    public static void main(String[] args) {
       double luas, phi=3.14;
       int jari;
       Scanner input=new Scanner(System.in);

       System.out.print("Masukan Jari-jari : ");
       jari=input.nextInt();

       luas=phi*jari*jari;

       System.out.println("Luas Lingkaran = "+luas);
    }
    }
    
