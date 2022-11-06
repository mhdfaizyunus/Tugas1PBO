public class Main {
    public static void main(String[] args) {
        Gaji y = new Gaji("Ruben ", "Bandar Buat ", 3, 9000.000);
        
        System.out.println("Menyusun Gaji ");
        System.out.println("Memanggil mailCheck Berdasarkan Referensi Gaji --");
        y.mailCheck();
        System.out.println("");
        
        System.out.println("Menyusun Pegawai ");
        Pegawai x = new Gaji("Ini Nama ", "Samarinda ", 2, 2500.00);
        System.out.println("Memanggil mailCheck Berdasarkan Referensi Pegawai--");
        x.mailCheck();

        

        
    }
}
