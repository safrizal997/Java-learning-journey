public class KonversiTipeDataNumber {

    public static void main(String[] args) {

        // Widening Casting (Otomatis): byte->short->int->long->float->double //
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;

        //Narrowing Casting (Manual): double->float->long->int->short->byte //
        byte iniByte2 = (byte)iniInt;

            // Number Overflow -> melebihi kapasitas tipe number seperti contoh dibawah //
            short inishort2=20000;
            byte inibyte3 = (byte)inishort2;
    }

}
