import java.time.temporal.TemporalAmount;

public class TipeDataPrimitifBukanPrimitif {
    public static void main(String[] args) {

    /* -Data primitif default value nya adalah 0 (nol)
       -Data bukan primitif default value nya adalah null (tidak ada data)
       -Data bukan primitif tipe datanya adalah object
     */
        //Bukan Primitif
        Integer iniIntegr = null;
        //Primitif
        int iniInt = 10;

        //Konversi
        byte age = 10;
        Byte ageObject = age;
        byte ageAgain = ageObject;

            Long jarak = 100000L;
            //metode = longValue()
            //Untuk konversi Tipe data yg tidak compatible ke primitif,menggunakan metode
            short ageshort = ageObject.shortValue();
            byte number = iniIntegr.byteValue();
            long jagaJarak = jarak.longValue();
    }
}
