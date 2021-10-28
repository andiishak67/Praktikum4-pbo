import java.util.Scanner;

class kubus{
	int sisi,volume;
}
public class VolumeKubus{
    public static void main(String[] args) {
       int sisi;
       int volume;
       Scanner input=new Scanner(System.in);
	System.out.println("=====Menghitung Volume Kubus=====");
       System.out.print("Masukkan sisi kubus : ");
       sisi=input.nextInt();

       volume=(sisi*sisi*sisi);

       System.out.println("volume kubus adalah = "+volume);
    }
    }
    
