/**
 * User: che
 * Date: 14.02.14
 * Time: 16:03
 */
public class ArrayTest {
    public static void main(String args[]) {


        //среднеарефмитическое десяти чисел
        double nums[] = {1, 2, 3, 4, 5, 100, 7, 856, 900, 10};
        double result = 0;
        for (int i = 0; i < nums.length; i++ ) {
            double a = result + nums[i];
            result = a;
            System.out.println(a);
        }

        double b = result / nums.length;
        System.out.println(b);




    }
}
