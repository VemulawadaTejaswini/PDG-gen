import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n=Integer.parseInt(sc.next());
int[] t=new int[n+1];
int[] x=new int[n+1];
int[] y=new int[n+1];
t[0]=0;x[0]=0;y[0]=0;
for(int i=1;i<=n;i++){
t[i]=Integer.parseInt(sc.next());
x[i]=Integer.parseInt(sc.next());
y[i]=Integer.parseInt(sc.next());
}
String ans;
int count=0;
for(int i=0;i<n;i++){
    int dx=Math.abs(x[i+1]-x[i]);
    int dy=Math.abs(y[i+1]-y[i]);
    int dt=Math.abs(t[i+1]-t[i]);
    if(dt%2==(dx+dy)%2){
        if(dx+dy<=dt){count++;}
    }
}
if(count==n){ans="Yes";}else{ans="No";}
System.out.println(ans);
}}