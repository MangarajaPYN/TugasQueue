public class queue {

    String antriantol[];
    int antrianterakhir;
    int pjgantrian;


    public queue(int a) {
        antriantol = new String[a];
        antrianterakhir = -1;

    }

    public void tambahantrian(String platmobil) {
        if( antrianterakhir < antriantol.length-1 ) {
            antriantol[++antrianterakhir] = platmobil;
            System.out.println("mobil dengan plat "+platmobil+" masuk antrian");
        } else {
            //maximum capacity
        }
    }

    public String keluarantrian() {
        if (antrianterakhir > 0) {

            String temp = antriantol[0];
            --antrianterakhir;

            for (int i = 0; i < antriantol.length - 1; i++) {
                antriantol[i] = antriantol[i+1];
            }return temp;

        } else {
            //empty
        }return "";
    }
            public void cetak () {
        for (int i = 0; i < antriantol.length; i++) {
            System.out.println("no antrian " + (i+1) );
            System.out.println("plat mobil : " + antriantol[i]);        }
    }
}