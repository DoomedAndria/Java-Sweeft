import java.util.Arrays;

public class Ex3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 7, 8, 9};
        System.out.println(notContains(arr));
    }

    static int notContains(int[] array) {
        Arrays.sort(array);
        int left = 0;
        int right = 0;
        for (int a : array) {
            left = right;
            right = a;
            if (right - left > 1)
                return left + 1;
        }
        return array[array.length - 1] + 1;
    }

}
