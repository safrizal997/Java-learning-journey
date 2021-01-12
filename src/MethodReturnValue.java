public class MethodReturnValue {
    public static void main(String[] args) {

        System.out.println(sayHello("", ""));
        System.out.println(jumlah(10, 2));
        tesNumber("A");

    }

    static String sayHello(String firstName, String lastName) {
        if (firstName != "b" && lastName != "c"){

            return firstName + " " + lastName;
        }
        return "firstName dan lastName tak boleh kosong";
    }

    static int jumlah(int nilai1, int nilai2) {
        return nilai1 + nilai2;
    }

    static void tesNumber(String nilai){
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
