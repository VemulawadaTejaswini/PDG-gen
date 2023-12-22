import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
long a=Long.parseLong(sc.next());
long b=Long.parseLong(sc.next());
long c=Long.parseLong(sc.next());
long k=Long.parseLong(sc.next());
long ta=0;
long tb=0;
long tc=0;
for(long i=0;i<k;i++){
ta=a;tb=b;tc=c;
a=tb+tc;b=ta+tc;c=ta+tb;
}
long ans=a-b;
if(Math.abs(ans)>Math.pow(10,18)){System.out.println("Unfair");
}else{
System.out.println(ans);
}
}}