import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int N = sc.nextInt();
  long H = sc.nextLong();
  long[] a = new long[N];
  long[] b = new long[N];
  long amax = 0;
  for(int i = 0;i < N;i++){
    a[i] = sc.nextInt();
    b[i] = sc.nextInt();
    amax = Math.max(a[i],amax);
  }
  long[] au = new long[N];
  long[] bu = new long[N];
  int counter = 0;
  for(int i = 0;i < N;i++){
    if(b[i] >= amax){
      au[counter] = a[i];
      bu[counter] = b[i];
      counter++;
    }
  }
  Arrays.sort(bu);
  long sum = 0;
  int counterb = 0;
  boolean beat = false;
  for(int i = N-1;i >= N-counter;i--){
    sum += bu[i];
    counterb++;
    if(sum >= H){
      System.out.println(counterb);
      beat = true;
      break;
    }
  }
  if(beat == false){
    Arrays.sort(au);
    System.out.println(counter + (H-sum)/au[N-1]);
  }
}}