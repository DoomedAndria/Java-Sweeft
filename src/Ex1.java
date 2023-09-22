import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Ex1 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,5,1,2,3,4};
        System.out.println(singleNumber(nums1));
    }

    //ვერსია 1 :
    // იმ შემთხვევაში თუ გამეორებაში ნაგულისხმევია მხოლოდ ორჯერ გამეორება
    //(სიტყვა "გამეორება"დან გამომდინარე ცოტა დამაბნეველი იყო)

//    static int singleNumber(int[] nums){
//        int num = 0;
//        for (int a : nums)
//            num ^= a;
//        return num;
//    }

    //ვერსია 2 : იმ შემთხვევაში თუ გამეორება ორჯერ ან მეტჯერ ხდება
    static int singleNumber(int[] nums){
        Arrays.sort(nums);
        int count = 0;
        int curr = nums[0];
        for (int num: nums){
            if (curr == num)
                count++;
            else {
                if (count<2)
                    return curr;
                else {
                    count = 1;
                    curr = num;
                }
            }
        }
        return curr;
    }
}
