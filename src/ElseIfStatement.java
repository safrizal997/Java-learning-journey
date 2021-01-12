public class ElseIfStatement {
    public static void main(String[] args) {

        /*
        -Jika kita butuh beberapa kondisi
         */

        var nilai = 70;
        var absen = 80;

        if (nilai >= 85 && absen >= 85) {
            System.out.println("Nilai A");
        }
        else if (nilai >= 75 && absen >= 75){
            System.out.println("Nilai B");
        }
        else if (nilai >= 65 && absen >= 65){
            System.out.println("Nilai C");
        }
        else if (nilai >= 55 && absen >= 55){
            System.out.println("Nilai B");
        }
        else{
            System.out.println("Nilai E");
        }
        if (nilai >= 65 && absen >= 65) {
            System.out.println("memenuhi Syarat");
        }

    }
}
