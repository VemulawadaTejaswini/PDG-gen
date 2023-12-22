import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] ary=new int[n];
        int total=0;
        for(int i=0;i<n;i++){
            ary[i]=sc.nextInt();
            total+=ary[i];
        }
        Arrays.sort(ary);
        if(ary[n-m]>=total/(4*m)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}