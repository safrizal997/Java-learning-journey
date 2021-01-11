class TipeDataArray {
    public static void main(String[] args) {

        /*
        -Tipe data yang berisikan kumpulan data dengan tipe yang sama
        -Jumlah data si Array tidak bisa dirubah setelah pertama kali dibuat
         */

        String[] stringArray;
        stringArray = new String[3];
        stringArray[0] = "Rizal";
        stringArray[1] = "Riza";
        stringArray[2] = "Riz";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        char[] macamHuruf = new char[5];
        macamHuruf[0] = 'R';
        macamHuruf[1] = 'I';
        macamHuruf[2] = 'Z';
        macamHuruf[3] = 'A';
        macamHuruf[4] = 'L';

        System.out.println(macamHuruf[0]);
        System.out.println(macamHuruf[1]);
        System.out.println(macamHuruf[2]);
        System.out.println(macamHuruf[3]);
        System.out.println(macamHuruf[4]);

        stringArray[2] = "Safrizal";
        System.out.println(stringArray[2]);


// Kode Array Initializer

        String[] DaftarNama = new String[]{
                "rizal", "eko", "gua", "kamu",
        };
        System.out.println(DaftarNama.length);

        long[] duit ={10L, 20L, 30L
        };
        System.out.println(DaftarNama.length);

        System.out.println(DaftarNama[2]);

        DaftarNama[0] = null;
        duit[1] = 0;
//Testing commit pertama dari intelij
        System.out.println(DaftarNama[0]);
        System.out.println(duit[1]);

//Array didalam Array

        String[][] member = {
                {"Andi", "kuncung"},
                {"Budi", "Bima"},
                {"George"}
        };
        System.out.println(member[0][1]);
        System.out.println(member[1][0]);
        System.out.println(member[2][0]);


    }
}