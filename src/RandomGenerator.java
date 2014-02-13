import java.util.Random;

/**
 * User: che
 * Date: 12.02.14
 * Time: 15:14
 */
public class RandomGenerator {
    public static void main(String args[]) {
        RandomGenerator randomGenerator = new RandomGenerator();

        for (int i = 0; i < 200; i++)
            System.out.println(randomGenerator.getRNDint());


    }


    public String getRNDstring(){
        Random random = new Random();
        int value = random.nextInt(999999-100000) + 100000;
        String rnd = Integer.toString(value);
        return rnd;

    }

    public int getRNDint(){
        Random random = new Random();
        int value = random.nextInt(100000);
        return value;

    }

  /*
    Смотря какой язык, но похоже на яву или шарп лично по мне =)
    Как правило такие рандомайзеры (например MT19937), при указании 1 аргумента, выдают значения ОТ 0 и ДО указанного аргумента-1.
    То есть rand.nextInt(4) в вашем случае будет давать 0-3, плюс 2, получается от 2 до 5.

    А вообще целесообразней использовать методы типа rand.get(min, max) (т. е rand.get(2, 5)).
    Если такие имеются есесно.
  */
}
