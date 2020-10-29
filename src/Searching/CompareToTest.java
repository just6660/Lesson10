package Searching;

public class CompareToTest {

    public static void main(String[] args) {
        String a,b,c,d;
        a = "Apple";
        b = "Banana";
        c = "Cherry";
        d = "Kiwi";
        
        System.out.println("a vs b: " + a.compareTo(b));
        System.out.println("c vs a: " + c.compareTo(a));
        System.out.println("b vs d: " + b.compareTo(d));
        System.out.println("a vs c: " + a.compareTo(c));

    }

}
