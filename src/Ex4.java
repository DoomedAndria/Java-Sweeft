public class Ex4 {
    public static void main(String[] args) {
        System.out.print(addBinStrings("11","10"));
    }

    static String addBinStrings(String n1, String n2) {
        int len1 = n1.length();
        int len2 = n2.length();
        if (len2 > len1) {
            String temp = n1;
            n1 = n2;
            n2 = temp;
        }
        String res = "";
        int carry = 0;
        int sum;
        int i2= len2-1;
        for (int i = len1-1; i >=0 ; i--) {
            if(i2>=0) {
                sum = (n1.charAt(i) + n2.charAt(i2) - 2 * (int) '0') + carry;
                i2--;
            }
            else
                sum = (n1.charAt(i)-2*(int)'0') + carry;
            carry = sum/2;
            res = sum%2 + res;
        }
        if (carry>0)
            return 1+res;
        return res;
    }
}
