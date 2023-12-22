import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
      
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sumAll = 0;

        for(int i=1;i <= n; i++) {
            String t = String.valueOf(i);
            int sum = 0;
            for(int j = 0; j < t.length(); j++) {
                sum += Integer.parseInt(t.substring(j, j+1));
            }

            if(sum >=a && sum <=b) {
                sumAll += i;
            }

        }
        System.out.println(sumAll);
    }
}