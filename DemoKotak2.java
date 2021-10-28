import java.util.Scanner;

class Kotak{
		double panjang;
		double lebar;
		double tinggi;
}

class DemoKotak2{
	public static void main(String[] args){
		double volume;
		Kotak k = new Kotak();
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan nilai panjang = " );
		k.panjang = input.nextInt();
		System.out.print("Masukkan nilai lebar = " );
		k.lebar = input.nextInt();
		System.out.print("Masukkan nilai tinggi = " );
		k.tinggi = input.nextInt();
		volume = k.panjang * k.lebar * k.tinggi;
		System.out.println(" Volume kotak adalah = " + volume );
	}
}