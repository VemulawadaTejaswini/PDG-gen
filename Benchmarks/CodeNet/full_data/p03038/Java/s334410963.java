import java.io.*;
import java.util.*;

public class Main{
    
    public static void main(String[] arg){

        Scanner scan =new Scanner(System.in);

        int n=Integer.parseInt(scan.next());
        int m=Integer.parseInt(scan.next());

        Long[] A=new Long[n];
        

        for(int i=0;i<n;i++){
            A[i]=scan.nextLong();
        }

        int b,c,i,j;

        for(i=0;i<m;i++){

            b=Integer.parseInt(scan.next());
            c=Integer.parseInt(scan.next());
            
            Arrays.sort(A);
            j=0;

            while(A[j]<c && j<b){

                 A[j] = (long) c;
                 j = j+1;
            }
        }

        long sum = 0;
        for(long d : A){
        sum += d;
        }
        System.out.print(sum);
        
        
     
    }

}

