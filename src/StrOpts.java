/**
 * User: che
 * Date: 13.02.14
 * Time: 8:13
 */
public class StrOpts {
    public static void main(String args[]) {
        String str1 = new String("When it comes to Web   programming, Java is #1.");
        String str2 = new String(str1);
        String str3 = "Java string are powerfull.";
        int result, idx;
        char ch;


        System.out.println("Length of string: " + str1.length());


        //отображение str1 по одному символу
        for (int i = 0; i < str1.length(); i++)
            System.out.println(str1.charAt(i));
        System.out.println();


        if(str1.equals(str2))
            System.out.println(" str1 equal str2");
        else
            System.out.println(" str1 does not equal str2");


        result = str1.compareTo(str3);
        if (result == 0)
            System.out.println(" str1 and str3 are equal");
        else if (result < 0)
            System.out.println(" str1 less str3");
        else
            System.out.println(" str1 is greater than str3");


        str2 = " One Two Three One";
        idx = str2.indexOf(" One");
        System.out.println(" Index of first occurrence of one: 0 " + idx);
        idx = str2.lastIndexOf(" One");
        System.out.println(" Index of last occurrence of one: 0 " + idx);


        String orgstr = "Java makes the Web move.";
        String substr = orgstr.substring(5, 18);
        System.out.println("Original string is: " + orgstr);
        System.out.println("Substring is: " + substr);

    }
}
