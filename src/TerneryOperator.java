public class TerneryOperator {
    public static void main(String[] args) {

        // Tanpa Terery Operator, hanya menggunakan if else

        var nilai = 74;
        String ucapan;

        if (nilai >= 75) {
            ucapan = "Anda Lulus";
        } else{
            ucapan = "Anda Tidak Lulus";
        }
        System.out.println(ucapan);

        // Menggunakan Ternery Operator

        var nilai2 = 74;
        String ucapan2 = nilai2 >= 75 ? "Anda Lulus" : "Anda Tidak Lulus";

        System.out.println(ucapan2);




    }
}
