/**
 * User: che
 * Date: 14.02.14
 * Time: 16:13
 */
public class Bubble {
    public static void main(String args[]) {

//сортировка массива цифр
        int nums[] = {99, -10, 100132, 18, -978, 5623, 463, -9, 287, 49};
        int a, b, t;
        int size;
        size = 10;//число элементов для сортировки

        //отображение исходного массива
        System.out.println("Original array is:");

        for (int i = 0; i < size; i++)
            System.out.println(" " + nums[i]);
        System.out.println();

        //реализация пузырьковой сортировки
        for (a = 1; a < size; a++)
            for (b = size-1; b >= a; b--)  {
                if (nums[b -1] > nums[b]) {
                    //если треуемы порядок следования не соблюдается, элементы меняются местами
                    t = nums[b -1];
                    nums[b -1] = nums[b];
                    nums[b] = t;
                }

            }

        //отображение отсортированного массива
        System.out.println("Sorted array is: ");
        for (int i = 0; i < size; i++)
            System.out.println(" " + nums[i]);
        System.out.println();


//сортировка массива строк
        String str[] = {"Javacode", "I", "Like"};
        int c, d;
        String e;


        for (c = 1; c < str.length; c++)
            for (d = str.length -1; d >= c; d--)  {
                String st = str[d];
                String st1 = str[d -1];
                if (st.length() < st1.length()) {
                    //если треуемы порядок следования не соблюдается, элементы меняются местами
                    e = str[d -1];
                    str[d -1] = str[d];
                    str[d] = e;
                }
            }

        System.out.println("Sorted array is: ");
        for (int i = 0; i < str.length; i++)
            System.out.println(" " + str[i]);
        System.out.println();


    }
}
