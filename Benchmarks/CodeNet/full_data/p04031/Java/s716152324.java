import java.util.*;
public class Main {    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        sc.close();
        int sum=0;
        for(int a:nums){
            sum+=a;
        }
        double avtemp=(sum*10/n);
        int average=(int)Math.round(avtemp/10);
        int output=0;
        for(int a:nums){
            output+=(a-average)*(a-average);
        }
        System.out.println(output);
        

    }
    
}