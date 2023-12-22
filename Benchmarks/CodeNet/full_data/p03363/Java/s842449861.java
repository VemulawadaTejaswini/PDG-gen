import java.util.*;
import static java.lang.System.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
int n = sc.nextInt();
long[] a=new long[n+1];
a[0]=0;
HashMap<Long,Integer> m=new HashMap<>();
m.put(a[0],0);
int ans=0;
for(int i=1;i<=n;i++){a[i]=a[i-1]+sc.nextLong();m.put(a[i],0);}
for(int i=1;i<=n;i++){ans+=m.get(a[i]);m.put(a[i],m.get(a[i])+1);}
out.println(ans);
}}