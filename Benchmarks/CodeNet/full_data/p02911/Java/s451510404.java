import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int q=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<q;i++){
            nums[sc.nextInt()-1]++;
        }
        for(int i=0;i<n;i++){
            if(k+nums[i]-q>0)System.out.println("Yes");
            else System.out.println("No");
        }
        
    }

    
}