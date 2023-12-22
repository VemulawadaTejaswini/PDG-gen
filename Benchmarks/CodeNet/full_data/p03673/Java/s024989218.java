import java.util.*;
import java.util.Arrays;
import java.util.Set;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]a=new int[n];
        int[]b=new int[n];
        int[]c=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            b[i]=a[i];
            for(int j=0;j<=i;j++){
                c[j]=b[i-j];
                
            }
            for(int k=0;k<=i;k++){
                b[k]=c[k];
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(b[i]+" ");
        }


        }
        
        
    }
