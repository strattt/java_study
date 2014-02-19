/**
 * User: che
 * Date: 14.02.14
 * Time: 16:13
 */
public class Bubble {
    public static void main(String args[]) {
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

    }
}
