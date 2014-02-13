import java.util.Random;

/**
 * User: che
 * Date: 12.02.14
 * Time: 15:14
 */
public class RandomGenerator {
    public String getRNDstring(){
        Random random = new Random();
        int value = random.nextInt(999999-100000) + 100000;
        String string = Integer.toString(value);
        return string;

    }

    public int getRNDint(){
        Random random = new Random();
        int integer = random.nextInt(300) +300 ;
        return integer;
    }
}
