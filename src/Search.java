/**
 * User: che
 * Date: 12.02.14
 * Time: 8:30
 */
public class Search {
    public static void main(String args[]) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int val = 4;
        boolean found = false;

        for(int x: nums) {
            if(x == val) {
                found = true;
                break;
            }
        }

        if(found) {
            System.out.println("Its found!");
        }
        else {
            System.out.println("Not found!");
        }
    }
}
