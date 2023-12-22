import java.util.*;
public class Main{

 public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n];
        for(int i=0;i<n;i++){
            list[i] = sc.nextInt();
        }
        Arrays.sort(list);

        for(int i=0;i<n;i++){
        }
        double result = (double)list[0];
        for(int j=1;j<n;j++){
            result = (double)((result + list[j]) /2);
        }
        System.out.println(result);
    }

}