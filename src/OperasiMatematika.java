public class OperasiMatematika {
    public static void main(String[] args) {

        int a = 100;
        int b = 10;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

    // Augmented assignments
        int c = 100;

        c = c + 10; // ini sama dengan
        c += 10;

        System.out.println(c);

    // Unary Operator
        int d = 100;

        d++; // sama dengan d = 100 + 1
        // d--; sama dengan d = 100 - 1
        // d--; sama dengan d = 100 - 1
        System.out.println(d);

        // Boolean kebalikan (!)
            var e = !false;
            var f = !true;
        System.out.println(e);
        System.out.println(f);
        System.out.println(!true);



    }
}
