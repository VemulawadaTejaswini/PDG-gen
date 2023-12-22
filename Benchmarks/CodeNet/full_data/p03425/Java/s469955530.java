import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int N = sc.nextInt();
  int[] a = new int[5];
  Arrays.fill(a,0);
  for(int i = 0;i < N;i++){
    String s = sc.next();
    if(s.charAt(0) = 'M')a[0]++;
    if(s.charAt(0) = 'A')a[1]++;
    if(s.charAt(0) = 'R')a[2]++;
    if(s.charAt(0) = 'C')a[3]++;
    if(s.charAt(0) = 'H')a[4]++;
  }
  System.out.println(a[0]*a[1]*a[2]+a[1]*a[2]*a[3]+a[2]*a[3]*a[4]+a[3]*a[4]*a[0]+a[4]*a[0]*a[1]+a[0]*a[1]*a[3]+a[1]*a[2]*a[4]+a[2]*a[3]*a[0]+a[3]*a[4]*a[1]+a[4]*a[0]*a[2]);
}}