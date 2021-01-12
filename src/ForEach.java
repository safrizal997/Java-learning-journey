public class ForEach {
    public static void main(String[] args) {

        // perulangan for untuk mengakses data array secara otomatis

        String[] names ={
               "rizal", "Budi", "Jhon",
               "Grace", "Steve", "kuvukulen"
        };

        //Tanpa For Each
        for(int i=0; i < names.length; i++){
            System.out.println(names[i]);
        }

        //For Each
        for (var value : names){
            System.out.println(value);
        }

        int [] Values ={
                100,50,60,40,80,80
        };

        for (int value : Values){
            System.out.println(value);
        }
    }
}
