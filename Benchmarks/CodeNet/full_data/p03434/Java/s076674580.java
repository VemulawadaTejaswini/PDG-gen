import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
int[] a = new int[N]; 
for(int i = 0;i < N;i++){
a[i] = sc.nextInt();
}
Arrays.sort(a);
int sumA = 0;
int sumB = 0;
for(int i = 0;i < N;i = i+2){int sumA += i;}
for(int i = 1;i < N;i = i+2){int sumB += i;}
System.out.println(sumA - sumB);
}
}
