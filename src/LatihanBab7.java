public abstract class Salon {
    public double total,hargaP=0,hargaJ=0,harga;
    private String nama,jenis;
    String RinciPro="", RinciLay="";
    public abstract double getTotalHarga();
    public abstract void setProduk(int a, int b, String c);
    public abstract void setJasa(int a, String b);
    public void setNama(String a){
        nama=a;    }
    public String getNama(){
        return nama;}
    public String getJenis(){
        return jenis;    }
    public void setJenis(String a){
     jenis=a;    
	
	}
}
