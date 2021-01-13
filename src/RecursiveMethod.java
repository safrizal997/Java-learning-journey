public class RecursiveMethod {
    public static void main(String[] args) {

        // untuk memanggil method dirinya sendiri
        // contoh kasus faktorial:


        System.out.println(faktorialLoop(5));
        System.out.println(faktorialRecursive(5));

    }

    //penyelesaian dengan loop
    static int faktorialLoop(int value) {
        var result = 1;
        for (var counter = 1; counter <= value; counter++) {

            result *= counter;

        }
            return result;
    }
    //dengan Recursive method
    static int faktorialRecursive(int value){
        if (value == 1){
            return 1;
        }else {
            return value * faktorialLoop(value -1);
        }

    }
}
