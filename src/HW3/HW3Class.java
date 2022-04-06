package HW3;

public class HW3Class {
    public static void main(String[] args) {


        int i1 = 5, i2 = 11;
        double d1 = 5.5, d2 = 1.3;
        long l = 20l;
        double result = 0;
        result = i2/d1 +d2%i1 -l;

        System.out.println(i2/d1+"\n");
        System.out.println(d2%i1+"\n");
        System.out.println((i2/d1+d2%i1)+"\n");
        System.out.println(result+"\n\n\n");

        int a = 5, b = 8;
        System.out.println(a-- +"\n");
        System.out.println(--a +"\n");
        System.out.println(a-- - --a +"\n");
        System.out.println(++a +"\n");


        result = a-- - --a + ++a + a++ + a;
        System.out.println(result+"\n");

        result = ++b + b++ + ++b - --b;
        System.out.println(result+"\n");

    }
}
