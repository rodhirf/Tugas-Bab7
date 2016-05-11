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
//==========================================================================
class Premium extends Salon {
    public double getTotalHarga() {
        return total = hargaP + hargaJ;    }    
    public void setProduk(int a, int b, String c) {
        RinciPro += c +"\n";
        if (a==1) {
            hargaP += (50000 - (50000 * 0.1)) * b;
        } else if (a==2) {
            hargaP += (40000 - (40000 * 0.1)) * b;
        } else if (a==3) {
            hargaP += (30000 - (30000 * 0.1)) * b;
        } else if (a==4) {
            hargaP += (20000 - (20000 * 0.1)) * b;
        } else if (a==5) {
            hargaP += (10000 - (10000 * 0.1)) * b;    } }
    public void setJasa(int a, String b) {
        RinciLay += b +"\n";
        if (a==1) {
            hargaJ += (35000 - (35000 * 0.2));
        } else if (a==2) {
            hargaJ += (30000 - (30000 * 0.2));
        } else if (a==3) {
            hargaJ += (15000 - (15000 * 0.2));
        } else if (a==4) {
            hargaJ += (10000 - (10000 * 0.2));    } }
    public void tampil() {
        System.out.println("=============TAGIHAN PEMBAYARAN============");
        System.out.println("Nama Anda                : " + getNama());   System.out.println("===========================================");
        System.out.print("Rincian Belanja Produk   : "
                + "\n"+RinciPro);
        System.out.print("Rincian Belanja Jasa     : "
                + "\n"+RinciLay);
        System.out.println("Harga Yang Harus Dibayar : Rp. " + getTotalHarga());
        System.out.println("================TERIMA KASIH===============");     System.out.println("===========================================");  
	
	}
}
//==========================================================================
class Gold extends Salon {
    public double getTotalHarga() {
        return total = hargaP + hargaJ;    }
    public void setProduk(int a, int b, String c) {
        RinciPro += c +"\n";
        if (a==1) {
            hargaP += (50000 - (50000 * 0.1)) * b;
        } else if (a==2) {
            hargaP += (40000 - (40000 * 0.1)) * b;
        } else if (a==3) {
            hargaP += (30000 - (30000 * 0.1)) * b;
        } else if (a==4) {
            hargaP += (20000 - (20000 * 0.1)) * b;
        } else if (a==5) {
            hargaP += (10000 - (10000 * 0.1)) * b;   } }
    public void setJasa(int a, String b) {
        RinciLay += b +"\n";
        if (a==1) {
            hargaJ += (35000 - (35000 * 0.15));
        } else if (a==2) {
            hargaJ += (30000 - (30000 * 0.15));
        } else if (a==3) {
            hargaJ += (15000 - (15000 * 0.15));
        } else if (a==4) {
            hargaJ += (10000 - (10000 * 0.15));   } }
    public void tampil() {
        System.out.println("=============TAGIHAN PEMBAYARAN============");
        System.out.println("Nama Anda                : " + getNama());       System.out.println("===========================================");
        System.out.print("Rincian Belanja Produk   : "
                + "\n"+RinciPro);
        System.out.print("Rincian Belanja Jasa     : "
                + "\n"+RinciLay);
        System.out.println("Harga Yang Harus Dibayar : Rp. " + getTotalHarga());
        System.out.println("================TERIMA KASIH===============");        System.out.println("===========================================");
   
	 }
}
//==========================================================================
class Silver extends Salon {
    public double getTotalHarga() {
        return total = hargaP + hargaJ;    }
    public void setProduk(int a, int b, String c) {
        RinciPro += c +"\n";
        if (a==1) {
            hargaP += (50000 - (50000 * 0.1)) * b;
        } else if (a==2) {
            hargaP += (40000 - (40000 * 0.1)) * b;
        } else if (a==3) {
            hargaP += (30000 - (30000 * 0.1)) * b;
        } else if (a==4) {
            hargaP += (20000 - (20000 * 0.1)) * b;
        } else if (a==5) {
            hargaP += (10000 - (10000 * 0.1)) * b;   } }
    public void setJasa(int a, String b) {
        RinciLay += b +"\n";
        if (a==1) {
            hargaJ += (35000 - (35000 * 0.1));
        } else if (a==2) {
            hargaJ += (30000 - (30000 * 0.1));
        } else if (a==3) {
            hargaJ += (15000 - (15000 * 0.1));
        } else if (a==4) {
            hargaJ += (10000 - (10000 * 0.1));   } }
    public void tampil() {
        System.out.println("=============TAGIHAN PEMBAYARAN============");
        System.out.println("Nama Anda                : " + getNama());       System.out.println("===========================================");
        System.out.print("Rincian Belanja Produk   : "
                + "\n"+RinciPro);
        System.out.print("Rincian Belanja Jasa     : "
                + "\n"+RinciLay);
        System.out.println("Harga Yang Harus Dibayar : Rp. " + getTotalHarga());
        System.out.println("================TERIMA KASIH==============="); System.out.println("===========================================");
    
	}
}
//==========================================================================
class TanpaKeanggotaan extends Salon {
    public double getTotalHarga() {
        return total = hargaP + hargaJ;    }
    public void setProduk(int a, int b, String c) {
        RinciPro += c +"\n";
        if (a==1) {
            hargaP += 50000 * b;
        } else if (a==2) {
            hargaP += 40000 * b;
        } else if (a==3) {
            hargaP += 30000 * b;
        } else if (a==4) {
            hargaP += 20000 * b;
        } else if (a==5) {
            hargaP += 10000 * b;    } }
    public void setJasa(int a, String b) {
        RinciLay += b +"\n";
        if (a==1) {
            hargaJ += 35000;
        } else if (a==2) {
            hargaJ += 30000;
        } else if (a==3) {
            hargaJ += 15000;
        } else if (a==4) {
            hargaJ += 10000;  } }
    public void tampil() {
        System.out.println("=============TAGIHAN PEMBAYARAN============");
        System.out.println("Nama Anda                : " + getNama());       System.out.println("===========================================");
        System.out.print("Rincian Belanja Produk   : "
                + "\n"+RinciPro);
        System.out.print("Rincian Belanja Jasa     : "
                + "\n"+RinciLay);
        System.out.println("Harga Yang Harus Dibayar : Rp. " + getTotalHarga());
        System.out.println("================TERIMA KASIH===============");        System.out.println("===========================================");
    }
}
//==========================================================================





