public class Examples {
    public static void main(String[] args) {

        byte varByte = 100; //0 -128...127
        short varShort = 29000; //0 -32768...32767
        int varInt = 199999; //0 -2^31...(2^31)-1
        long varLong = 1999999999999L; //0L -2^63...(2^63)-1
        float varFloat = 1.9f; //0.0f -3.4E+38 до 3.4E+38
        double varDouble = 1.9; //0.0 -1.7E+308 до 1.7E+308

        int a = 9;
        int b = 18;
        int c = 19;
        int d = 18;

        //арифметические операторы
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println("c % a = " + (c % a));
        System.out.println("++a = " + (++a));
        System.out.println("a++ = " + (a++));
        System.out.println("b-- = " + (a--));

        //операторы сравнения
        System.out.println("a < b = " + (a < b));
        System.out.println("b > a = " + (b > a));
        System.out.println("b == d = " + (b == d));
        System.out.println("b <= d = " + (b <= d));
        System.out.println("b >= d = " + (b >= d));
        System.out.println("a != b = " + (a != b));

        //переполнение
        System.out.println((byte) (varByte + 28));
        System.out.println((short) (varShort + varLong));

        //int & double
        System.out.println("varInt + varDouble: " + (varInt + varDouble));
        System.out.println("varInt - varDouble: " + (varInt - varDouble));
    }
}
