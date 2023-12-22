import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n=Integer.parseInt(sc.next());
int[] a=new int[n+1];
a[0]=0;
for(int i=1;i<=n;i++){a[i]=Integer.parseInt(sc.next());}

for(int i=1;i<=n;i++){
int sum=0;
    for(int j=1;j<i;j++){
    sum+=Math.abs(a[j]-a[j-1]);
    }
    for(int j=i++;j<=n;j++){
        if(j==i++){
        sum+=Math.abs(a[j]-a[i-1]);
        }else{
        sum+=Math.abs(a[j]-a[j-1]);
        }
    }
    if(i!=n){sum+=Math.abs(a[n]);}else{sum+=Math.abs(a[n-1]);}
    System.out.println(sum);
}
}}