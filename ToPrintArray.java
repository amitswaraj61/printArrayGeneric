package Array;

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

    private static void toPrint(Character[] c) {
        for(Character item: c)
        {
            System.out.println(item);
        }
    }

    private static void toPrint(Double[] b) {
        for(Double item: b)
        {
            System.out.println(item);
        }
    }

    private static  void toPrint(Integer[] a)
    {
        for (Integer item : a)
        {
          System.out.println(item);
        }
    }
}
