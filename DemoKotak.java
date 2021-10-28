class Kotak{
	double panjang;
	double lebar;
	double tinggi;
}
class DemoKotak{
		public static void main(String[] args ){
		double volume;
		Kotak k = new Kotak();
		k.panjang = 4;
		k.lebar = 3;
		k.tinggi = 2;
		volume = k.panjang * k.lebar * k.tinggi;
		System.out.println("Volume Kotak = " + volume );
}
}