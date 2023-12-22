import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        Arrays.sort(a);
        boolean po=true;
        for(int i=0;i<n-2;i++){
            if(a[i]+a[i+1]!=a[i+2])po=false;
        }
        if(a[1]-a[n-1]!=a[0])po=false;
        
        System.out.println(po?"Yes":"No");
    }
}
