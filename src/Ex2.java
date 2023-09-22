public class Ex2 {
    public static void main(String[] args) {
        System.out.println(minSplit(90));
    }
    static int minSplit(int amount){
        int[] coins = {50,20,10,5,1};
        int count = 0;
        for (int c: coins){
            count += amount/c;
            amount %=c;
        }
        return count;
    }
}
