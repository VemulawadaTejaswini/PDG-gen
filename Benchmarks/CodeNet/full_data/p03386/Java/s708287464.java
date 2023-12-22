import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
Set<Integer> num=new HashSet<>();
int a=Integer.parseInt(sc.next());
int b=Integer.parseInt(sc.next());
int k=Integer.parseInt(sc.next());
for(int i=a;i<a+k&&i<=b;i++){
num.add(i);
}
for(int i=b;i>b-k&&i>=a;i--){
num.add(i);
}
for(int i:num){
System.out.println(i);
}
}}