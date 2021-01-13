public class MethodOverLoading {
    public static void main(String[] args) {


        msRizal();
        msRizal("Safrizal");
        msRizal("Rizal","bro");
    }

    static void msRizal(){
        System.out.println("R");
    }
    static void msRizal(String nama){
        System.out.println(nama);
    }
    static void msRizal(String firstName, String lastName){
        System.out.println("Nama Lengkap: "+ firstName +" "+ lastName);
    }
}
