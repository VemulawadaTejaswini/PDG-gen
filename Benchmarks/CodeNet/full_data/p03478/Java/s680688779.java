import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
      
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sumAll = 0;

        for(int i=1;i <= n; i++) {
            int sum = 0;
            int div = i;
            while(true) {
                sum += div % 10;
                div = div / 10;

                if(div == 0) {
                    break;
                }
            }
            if(sum >=a && sum <=b) {
                sumAll += i;
            }
        }
        System.out.println(sumAll);
    }
}