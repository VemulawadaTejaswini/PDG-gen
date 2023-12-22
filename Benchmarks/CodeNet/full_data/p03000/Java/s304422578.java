import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,x;
        int d = 0;
        int count = 0;
        n = sc.nextInt();
        x = sc.nextInt();
        int[] l = new int[n];
        for(int i=0;i<n;i++){
            l[i] = sc.nextInt();
        }
        while(x>=d&&n>count){
            d = d+l[count];
            count++;
        }
        System.out.println(count);
    }
}