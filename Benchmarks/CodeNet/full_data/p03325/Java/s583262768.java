import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
long[] a = new long[n];
int count = 0;
for(int i = 0;i < n;i++){
a[i] = sc.nextLong();
while(a[i]%2 == 0){
count++;
a[i] /= 2;
}
}
System.out.println(count);
}}