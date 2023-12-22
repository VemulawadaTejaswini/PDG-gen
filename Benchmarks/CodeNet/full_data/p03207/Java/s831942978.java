import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int max = 0;
        for(int i = 0;i < n;i++){
            int price = sc.nextInt();
            sum += price;
            if(max < price)
            max = price;
        }
        System.out.println(sum-max);
    }
}