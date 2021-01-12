import java.util.Date;

public class ExpressionStatementBlock {
    public static void main(String[] args) {

        /*
        -Expression - konstrusi dari variabel, operator, dan pemanggil method yg mengevaluasi
         menjadi sebuah single value
        -komponen dari Statement

        -statement - kumpulan expression, biasanya di akhiri dengan (;)

        -Block - Kumpukan statement, diawali dan diakhiri dengan {}
         */


        // jenis2 Statement:
        //- Assigement statement
        double aValue = 12.489;
        //- Increament statement
        aValue++;
        //- Method Invocation statement
        System.out.println(aValue);
        //- Object Creation Statement
        Date date =new Date();

    }
}
