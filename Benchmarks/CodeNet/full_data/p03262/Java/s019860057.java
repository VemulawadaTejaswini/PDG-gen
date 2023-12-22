import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
int n=sc.nextInt();
int X=sc.nextInt();
int[] x=new int[n];
int[] y=new int[n];
for (int i = 0; i < n; i++) {
    x[i]=sc.nextInt();
}
for (int i = 0; i < n; i++) {
    y[i]=abs(x[i]-X);
}
Arrays.sort(y);
for (int i = n-1; i >=0; i--) {
    if(y[i]%y[0]!=0){
        out.println(1);exit(0);
    }
}
out.println(y[0]);
}}