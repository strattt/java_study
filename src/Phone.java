/**
 * User: che
 * Date: 14.02.14
 * Time: 8:09
 */
public class Phone {
    public static void main(String args[]) {
        String numbers[][] = {
                {"Tom", "111-111"},
                {"Mary", "222-222"},
                {"Jon", "333-333"},
                {"Rachel", "444-444"}
        };

        int i;

        if (args.length != 1)
            System.out.println("Usage: java  phone <name>");
        else {
            for (i = 0; i < numbers.length; i++) {
                if(numbers[i][0].equals(args[0])) {
                    System.out.println(numbers[i][0] + " : " + numbers[i][1]);
                    break;
                }
            }

            if (i == numbers.length)
                System.out.println("Name not found.");
        }



    }
}
