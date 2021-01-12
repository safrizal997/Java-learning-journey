public class ForLoop {
    public static void main(String[] args) {

        /*
        -For adalah katakunci untuk melakukan perulangan
        -Blok kode yang terdapat didalam for akan selalu diulangi jika kondisi for terpenuhi

        Sintak perulangan for:
          |  for (initStatenemt; kondisi ; post Statement){   |
          |     // Blok perulangan                            |
          |  }                                                |

            -init statement: dieksekusi hanya sekali diawal perulangan saja
            -konsisi : jika true perulangan akan selalu dilakukan, jika false maka perulangan berhenti
            -post Statement : akan dieksekusi di setiap akhir perulangan
            -jika kondisi tidak diisi, berarti akan selalu bernilai true
         */

        var counter = 1;

        for (;counter <= 10;){
            System.out.println("Perulangan ke-" + counter);
            counter++;
        }

        ////

        for (var counter2 = 10;counter2 >= 2; counter2--){
            System.out.println("Perulangan ke-"+ counter2);
        }
    }
}
