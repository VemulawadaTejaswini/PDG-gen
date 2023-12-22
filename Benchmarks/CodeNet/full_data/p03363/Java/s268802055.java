import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int count = 0;
long[] a = new long[n];
for(int i = 0;i < n;i++){
a[i] = sc.nextLong();
for(int j = i;i>=0;i--){
long sum = 0;
sum += a[i];
if(sum == 0){
count++;
}
}
}
System.out.println(count);
}}