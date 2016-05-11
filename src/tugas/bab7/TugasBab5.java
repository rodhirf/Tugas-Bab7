public class Main {
    static String[] produk = new String[5];
    static String[] jasa = new String[4];
    static String[] pelanggan = new String[4];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = "", masukan = "";
        pelanggan[0] = "1. Premium            (Diskon Jasa = 20%)";
        pelanggan[1] = "2. Gold               (Diskon Jasa = 15%)";
        pelanggan[2] = "3. Silver             (Diskon Jasa = 10%)";
        pelanggan[3] = "4. Tanpa Keanggotaan  (Tidak Ada Diskon)";
        produk[0] = "Catokan                    Rp. 50000";
        jasa[0] = "Creambath                  Rp. 35000";
        produk[1] = "Pengering Rambut           Rp. 40000";
        jasa[1] = "Keramas                    Rp. 30000";
        produk[2] = "Minyak Rambut              Rp. 30000";
        jasa[2] = "Diribonding                Rp. 15000";
        produk[3] = "Conditioner                Rp. 20000";
        jasa[3] = "Potong Rambut              Rp. 10000";
        produk[4] = "Shampo                     Rp. 10000";
        do {
            System.out.println("===============PROGRAM SALON===============");
            System.out.println("Daftar Diskon");
            for (int i = 0; i < pelanggan.length; i++) {
                System.out.println(pelanggan[i]);  }
System.out.println("===========================================");
            System.out.print("Masukkan Pilihan Anda : ");
            int pil = in.nextInt();
            switch (pil) {
                case 1:
                    Salon pembeliP = new Premium();
System.out.println("===================PREMIUM=================");
                    menu(pembeliP);
                    System.out.println("");
                    ((Premium) pembeliP).tampil();
                    System.out.print("Mau Ulang Lagi (Y/N) : ");
                    input = in.next();
                    break;
                case 2:
                    Salon pembeliG = new Gold();
System.out.println("=====================GOLD==================");
                    menu(pembeliG);
                    System.out.println("");
                    ((Gold) pembeliG).tampil();                    
                    System.out.print("Mau Ulang Lagi (Y/N) : ");
                    input = in.next();
                    break;
                case 3:
                    Salon pembeliS = new Silver();
System.out.println("====================SILVER=================");
                    menu(pembeliS);
                    System.out.println("");
                    ((Silver) pembeliS).tampil();
                    System.out.print("Mau Ulang Lagi (Y/N) : ");
                    input = in.next();
                    break;
                case 4:
                    Salon pembeli = new TanpaKeanggotaan();
                    System.out.println("=============TANPA KEANGGOTAAN============");
                    menu(pembeli);
                    System.out.println("");
                    ((TanpaKeanggotaan) pembeli).tampil();
                    System.out.print("Mau Ulang Lagi (Y/N) : ");
                    input = in.next();
                    break;
                default:
                    System.out.println("PILIHAN TIDAK DITEMUKAN");
                    break;  }
        } while (input.equalsIgnoreCase("Y")); }
    public static void menu(Salon p) {
        Scanner in = new Scanner(System.in);
        String masukan = "";
        System.out.print("Masukkan Nama : ");
        p.setNama(in.nextLine());       System.out.println("===========================================");
        System.out.println("No. Produk                     Harga");
        for (int i = 0; i < produk.length; i++) {
            System.out.println((i + 1) + ". " + produk[i]);}
System.out.println("===========================================");
        System.out.println("No. Jasa                       Harga");
        for (int i = 0; i < jasa.length; i++) {
            System.out.println((i + 1) + " " + jasa[i]); }
System.out.println("===========================================");
        do {
            System.out.print("Masukkan Pilihan  Anda (Produk/Jasa) : ");
            String pilihan = in.next();
            if (pilihan.equalsIgnoreCase("Produk")) {
                System.out.print("Masukkan Jumlah Produk Yang Ingin Dibeli : ");
                int a = in.nextInt();
                for (int i = 0; i < a; i++) {
                    System.out.print("Barang " + (i + 1) + " (Nomor) : ");
                    int pilih = in.nextInt();
                    System.out.print("Jumlah    : ");
                    int jum = in.nextInt();
                    p.setProduk(pilih, jum, produk[pilih-1]); }
                System.out.print("Ingin Beli Yang Lain (Y/N)? ");
                masukan = in.next();
            } else if (pilihan.equalsIgnoreCase("Jasa")) {
                System.out.print("Masukkan Jumlah Jasa yang ingin dibeli : ");
                int b = in.nextInt();
                for (int i = 0; i < b; i++) {
                    System.out.print("Jasa " + (i + 1) + " (Nomor) : ");
                    int Jasa = in.nextInt();
                    p.setJasa(Jasa, jasa[Jasa-1]);  }
                System.out.print("Ingin Beli Yang Lain (Y/N)? ");
                masukan = in.next();  }
        } while (masukan.equalsIgnoreCase("Y")); 

	
	 }
}
