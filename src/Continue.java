public class Continue {
    public static void main(String[] args) {

        //Countinue, menghentikan perulangan saat ini dan melanjutkan perulangan selanjutnya


        for (int counter = 1; counter <=100; counter++){
            if(counter % 2 == 0){
                continue;
            }

                System.out.println("Perulangan angka ganji- "+ counter);
        }

    }
}
