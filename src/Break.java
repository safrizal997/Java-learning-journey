public class Break {
    public static void main(String[] args) {

        /*
        menghentikan seluruh perulangan

         */


        var counter = 1;

        while (true){
            System.out.println("perulangan ke-" + counter);
            counter++;
            if (counter >10) {
                break;
            }
        }

    }
}
