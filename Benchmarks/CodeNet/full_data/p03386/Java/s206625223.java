import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
Set<Long> num=new HashSet<>();
long a=Long.parseLong(sc.next());
long b=Long.parseLong(sc.next());
long k=Long.parseLong(sc.next());
for(long i=a;i<a+k&&i<=b;i++){
num.add(i);
}
for(long i=b;i>b-k&&i>=a;i--){
num.add(i);
}
for(long i:num){
System.out.println(i);
}
}}