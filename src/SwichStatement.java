public class SwichStatement {
    public static void main(String[] args) {


        var nilai = "D";

        switch (nilai){
            case "A":
                System.out.println("Sangat Memuaskan");
                break;
            case "B":
            case "C":
                System.out.println("Cukup Bagus");
                break;
            case "D":
                System.out.println("kurang");
                break;
            default:
                System.out.println("Pasti anda salah jurusan");

        }


    }
}
