public class MethodVariabelArgument {
    public static void main(String[] args) {

        /*
        -untuk mengirim data ke method dengan jumlah data yang tidak psti
        -menggunalan array sebagai parameter
        -parameter dengan tipe variabel argument hanya bisa ditempatkan di paling akhir
         */


        int[] values = {80,90,70,60,40};
        sayCongrats("Rizal",values);

        predikat("Mas Bro",90,99,96,98,96,97,100);

    }

    //Menggunakan Array

    static void sayCongrats(String name, int[] values) {
        var total = 0;
        for (var value : values) {
            total += value;
            System.out.println(value);
            System.out.println(total);
        }
        var finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println("Selamat " + name + " Anda Lulus");
        } else {
            System.out.println("Maaf " + name + " Anda Tidak Lulus");
        }
        System.out.println(finalValue);


    }
        //Variabel Argument
    static void predikat(String nama, int... banyakNilai){
        var jumlah=0;
        for(var nilai : banyakNilai){
            jumlah  +=nilai;
        }
        var rataRataNilai = jumlah / banyakNilai.length;

        if(rataRataNilai >= 95){
            System.out.println("predikat terbaik, atas nama "+nama+ " dengan rata nilai "+rataRataNilai );
        }
    }
}
