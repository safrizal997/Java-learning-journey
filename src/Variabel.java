public class Variabel {
    public static void main(String[] args) {

        /*
        -Adalah tempat untuk menyimpan data
        -Variabel hanya bisa digunakan untuk menyimpan tipe data yang sama,
         karena java adalah bahasa static type
        -penulisan-> Tipe data lalu variabel
        -tidak boleh mengandung whitespace (spasi, enter, tab) tidak boleh seluruhnya number
         */

        String name;
        name = "Rizal Sitorus";

        System.out.println(name);

        int age = 30;
        String address = "Indonesia";

        System.out.println(age);
        System.out.println(address);

        /*
        dapat membuat value yang berbeda dengan variabel dan tipe data yang sama,
        karena java berjalan dari atas ke bawah. Contoh:
         */

        name = "Rizal Charcoal";
        System.out.println(name);

        //Kata kunci var
            /*
            -Java versi >10
            -menggunakan katakunci var tidak perlu menyebutkan tipe daya nya lagi
            -saat menggunakan kata kunci var untuk membbuat variabel,
            kita harus menginisiasi value/nilai dari variabel tersebut secara langsung
             */
            var callName ="Ijal";
            var Age = 23;
            var initial = 'I';
            var gemuk = false;
            var kurus = true;


        //Kata kunci final
            /*
            -ini digunakan agar value dari variabel tidak bisa diubah meski dalam tipe data yang sama
            -istilah variabel seperti ini banyak juga yang menyebutnya konstan
             */

            final String Profesi = "Kacung";
            //Profesi = "Presiden"; maka akan error

            final var answer = false;
            //answer = true; maka error juga

    }
}
