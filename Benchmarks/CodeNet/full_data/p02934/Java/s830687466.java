import java.util.*;
public class Main{

 public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n];
        for(int i=0;i<n;i++){
            list[i] = sc.nextInt();
        }
        long mama = 1;
        for(int j=0;j<n;j++){
            mama = mama*list[j];
        }
        long sum = 0;
        for(int k=0;k<n;k++){
            sum = sum + (mama/list[k]);
        }
        float result = (float)mama/sum;
        System.out.println(result);

    }

}