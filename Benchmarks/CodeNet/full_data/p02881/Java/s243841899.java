import java.util.*;
public class Main{
public static void main(String args){
Scanner sc = new Scanner(System.in);
long n = sc.nextLong();
long c1 = new long[10000];
long c2 = new long[10000];
int g=0;
long a=Long.MAX_VALUE;
long y = new long[10000];
for(long i=1;i<(long)Math.sqrt(n)+1;i++){
if(n%i==0){
c1[g] = i;
c2[g] = n/i;
g+=1;
}
}
for(int i=0;i<g;i++){
a = Math.min(a,c1[i]+c2[i]-2);
}
System.out.println(a);
}
}