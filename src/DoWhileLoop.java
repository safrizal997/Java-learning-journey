public class DoWhileLoop {
    public static void main(String[] args) {

        /*
        -perbedaannya dengan while loop :
        pengecekan kondisi while loop selalu dilakukan diawal perulangan,
        sedangkan do while loop dilakukan di akhir perulangan
        -oleh karena itu pasti dilakukan sekali perulangan meski kondisi bernilai false
         */

        var counter = 100;

        do {
            System.out.println("perulangan ke-" + counter);
            counter++;
        } while (counter <= 10);

    }
}
