public class WhileLoop {
    public static void main(String[] args) {

        /*
        -Jenis perulangan yang lebih sederhana dinanding forLoop
        -Hanya terdapat kondisi perulangan tanpa ada init dan post statement
         */


        var counter = 1;

        while (counter <= 10){
            System.out.println("perulangan ke-" + counter);
            counter++;
        }
    }
}
