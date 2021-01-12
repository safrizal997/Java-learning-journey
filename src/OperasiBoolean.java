public class OperasiBoolean {
    public static void main(String[] args) {

        /*

        && -> Dan
        || -> Atau
        !  -> Kebalikan

        Nilai 1     Operator    Nilai 2     Hasil
        true        &&          true        true
        true        &&          false       false
        false       &&          true        false
        false       &&          false       false

        Nilai 1     Operator    Nilai 2     Hasil
        true        ||          true        true
        true        ||          false       true
        false       ||          true        true
        false       ||          false       false

         */


        var absen = 70;
        var nilaiAkhir = 80;

        boolean lulusAbsen = absen >= 75;
        boolean lululNilai = nilaiAkhir >= 75;

        var lulus = lulusAbsen && lululNilai;

        System.out.println(lulus);


    }
}
