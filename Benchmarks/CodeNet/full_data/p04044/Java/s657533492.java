import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l=sc.nextInt();
        String a[]=new String[n];
        for(int i=0;i<n;i++){
        	a[i]=sc.next();
        }
        Arrays.sort(a);
         for(int i=0;i<n;i++){
        	System.out.print(a[i]);
        }
    }
}
