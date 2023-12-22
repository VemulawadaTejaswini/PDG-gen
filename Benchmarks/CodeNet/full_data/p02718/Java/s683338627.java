import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[N];

        int total = 0;
        for(int i=0; i<N; i++){
          arr[i]=sc.nextInt();
          total+=arr[i];
        }

        boolean ans = sol(arr, m, total);
        if(ans==true)
          System.out.println("Yes");
        else
          System.out.println("No");

        sc.close();
    }
    public static boolean sol(int[] arr, int m, int total){
      int i=0;
      int N=arr.length;
      int count=0;
      // System.out.println(m);
      // System.out.println(total);
      int check =(int) (1*total)/(4*m);
      // System.out.println(check);
      for(i=0; i<N; i++){
        if(arr[i]>=check && count!=m){
          count++;
        }
      }
      // System.out.println(count);
      if(count==m)
        return true;
      else
        return false;
    }

}



