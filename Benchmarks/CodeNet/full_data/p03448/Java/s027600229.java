import java.util.*;
 
class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
      
        int fiveHandredYenCoins = sc.nextInt();
        int oneHandredYenCoins = sc.nextInt();
        int fiftyYenCoins = sc.nextInt();
        int sumYen = sc.nextInt();
 
        int count = 0;
 
        for(int a=0;a<=fiveHandredYenCoins;a++) {
            for(int b=0;b<=oneHandredYenCoins;b++) {
                for(int c=0;c<=fiftyYenCoins;c++) {
                    if((500 * a) + (100 * b) + (50 * c) == sumYen) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}