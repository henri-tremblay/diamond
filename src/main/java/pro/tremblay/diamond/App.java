package pro.tremblay.diamond;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Diamond diamond = new Diamond();
        String result = diamond.print(args[0].charAt(0));
        System.out.println(result);
    }
}
