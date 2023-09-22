public class Ex5 {
    public static void main(String[] args) {
        System.out.println(countVariants(8));
    }

    //ვაარიანტი 1
    static  int countVariants(int stearsCount){ //stairs*
        int variants = 0;
        int maxTwoStep = stearsCount/2;
        for (int i = 0; i <= maxTwoStep; i++) {
            variants+=C(stearsCount-i,i);
        }
        return variants;
    }

    //დაკვირვების შედეგად აღმოვაჩინე რომ რაოდენობა
    // ფიბონაჩის მიმდევრრობის n+2 წევრს ემთხვევა
    // ასერომ გვექნება ამოხსნის მეორე ვარიანტი :))

    //ვარიანტი 2:
//    static int countVariants(int stearsCount){ //stairs*
//        return fib(stearsCount+2);
//    }




    static int fib(int n){
        if (n==1)
            return 0;
        if (n==2)
            return 1;
        return fib(n-2) + fib(n-1);
    }

    //კომბინაციების რაოდენობა m!/(m-n)!/n!
    static int C(int m, int n){
        int num = 1;
        int den = 1;
        for (int i = 0; i < m-n; i++) {
            num*=(m-i);
            den*=(i+1);
        }
        return num/den;
    }
}
