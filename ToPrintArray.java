package Array.printArrayGeneric;

public class ToPrintArray
{
    public static void main(String args[])
    {
        Integer[] a={2,3,4};
        Double[] b={2.2,4.2,5.6};
        Character[] c={'a','m','i','t'};
        toPrint(a);
        toPrint(b);
        toPrint(c);

    }

    private static <E> void toPrint(E[] a)
    {
        for (E item : a)
        {
            System.out.println(item);
        }
    }
}