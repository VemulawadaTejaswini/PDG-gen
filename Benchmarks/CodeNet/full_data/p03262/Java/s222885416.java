import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
int n=sc.nextInt();
int X=sc.nextInt();
int[] x=new int[n+1];
x[0]=X;
int[] y=new int[n];
for (int i = 0; i < n; i++) {
    x[i+1]=sc.nextInt();
}
Arrays.sort(x);
for (int i = 0; i < n; i++) {
    y[i]=x[i+1]-x[i];
}
Arrays.sort(y);
out.println(y[0]);
}}