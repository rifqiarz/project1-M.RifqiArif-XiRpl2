package main;

import classes.*;

import java.util.Scanner;

public class MainAplikasiKasir {

    public static void  main(String[] args) {
        Scanner input = new Scanner(System.in);

        MainAplikasiKasir app = new MainAplikasiKasir();
        app.generateDaftarMenu();
    }

    public DaftarMenu daftarMenu;

    public void generateDaftarMenu() {
        daftarMenu = new DaftarMenu();

        daftarMenu.tambahMenu(new Ramen("Ramen Seafood", 25.000));
        daftarMenu.tambahMenu(new Ramen("Ramen Original", 18.000));
        daftarMenu.tambahMenu(new Ramen("Ramen Vegetarian", 22.000));
        daftarMenu.tambahMenu(new Ramen("Ramen Karnivor", 28.000));

        daftarMenu.tambahMenu(new Kuah("Kuah Orisinal"));
        daftarMenu.tambahMenu(new Kuah("Kuah Internasional"));
        daftarMenu.tambahMenu(new Kuah("Kuah Spicy Lada"));
        daftarMenu.tambahMenu(new Kuah("Kuah Soto Padang"));

        daftarMenu.tambahMenu(new Toping("Crab Stick Bakar", 6.000));
        daftarMenu.tambahMenu(new Toping("Chicken Katsu", 8.000));
        daftarMenu.tambahMenu(new Toping("Gyoza Goreng", 4.000));
        daftarMenu.tambahMenu(new Toping("Bakso Goreng", 7.000));
        daftarMenu.tambahMenu(new Toping("Enoki Goreng", 5.000));

        daftarMenu.tambahMenu(new Minuman("Jus AlpukatSPC", 10.000));
        daftarMenu.tambahMenu(new Minuman("Jus Stroberi", 11.000));
        daftarMenu.tambahMenu(new Minuman("Capucino Coffer", 15.000));
        daftarMenu.tambahMenu(new Minuman("Vietnam Dripp", 14.000));

        daftarMenu.tampilDaftarMenu();

    }

}
