import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
int n = sc.nextInt();
int[] x=new int[n+1];
int[] y=new int[n+1];
for(int i=1;i<=n;i++){x[i]=sc.nextInt();y[i]=x[i];}
Arrays.sort(x);
int m=(x[n/2]+x[n/2+1])/2;
for (int i = 1; i <= n; i++) {
    if(y[i]<=m){
        out.println(x[n/2+1]);
    }else{
        out.println(x[n/2]);
    }
}
}
}