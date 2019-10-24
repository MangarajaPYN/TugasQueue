public class queuetest {
    public static void main(String[] args) {

        queue cetak = new queue(6);

        System.out.println();

        cetak.tambahantrian("bm911");
        cetak.tambahantrian("bm922");
        cetak.tambahantrian("bm221");
        cetak.tambahantrian("bk332");
        cetak.tambahantrian("bk775");

        System.out.println();
        System.out.println("mobil yang sedang mengantri : ");
        System.out.println();
        cetak.cetak();
        System.out.println();
        System.out.println("mobil dengan plat mobil "+cetak.keluarantrian()+" telah selesai mengantri...");
        System.out.println();
        System.out.println("mobil yang sedang mengantri : ");
        System.out.println();
        cetak.cetak();

        System.out.println();
        cetak.tambahantrian("bm001");
        cetak.tambahantrian("bk001");

        System.out.println();
        System.out.println("mobil yang sedang mengantri = ");
        System.out.println();
        cetak.cetak();
    }
}