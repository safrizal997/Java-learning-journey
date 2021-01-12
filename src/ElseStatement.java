public class ElseStatement {
    public static void main(String[] args) {

        /*
        - Jika If hanya mengeksekusi value 'true'
        - sebaliknya Else hanya mengeksekusi value 'false'
         */

        var nilai = 70;
        var absen = 80;

        if (nilai >= 75 && absen >= 75){
            System.out.println("Selamat Anda Lulus");
        }
        else{
            System.out.println("Anda Belum Beruntung");
        };

    }
}
