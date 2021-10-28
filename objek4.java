class objek4{
	private String nama;
	private String nim;
	private String ttl;
	private String agama;
	
public objek4(String nama,String nim, String m, String agama){
this.nama = nama;
this.nim = nim;
this.ttl = ttl;
this.agama = agama;
}

public String getNama(){
	return this.nama;
}
public String getNim(){
	return nim;
}

public static void main(String args[]){
	mhs m  = new mhs ("ishak", "51021801", "20" , "islam");
	System.out.println("nama = " + m.getNama());
	System.out.println("nim = " + m.getNim());
}
}