import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int N = sc.nextInt();
  long[] a = new long[N];
  long[] b = new long[N];
  long[] c = new long[N];
  for(int i = 0;i < N;i++){
    c[i] = sc.nextLong();
  }
  for(int i = 0;i < N;i++){
    b[i] = sc.nextLong();
  }
  for(int i = 0;i < N;i++){
    a[i] = sc.nextLong();
  }
  Arrays.sort(a);
  Arrays.sort(b);
  Arrays.sort(c);
  int bmax=0;
  int bmin=0;
  for(int i = N-1;;i--){
    if(b[i] >= a[N-1] && a[N-1] >= b[i-1]){
      bmax = i;
      break;
    }
  }
  for(int i = 0;;i++){
    if(b[i+1] >= c[0] && c[0] >= b[i]){
      bmin = i;
      break;
    }
  }
  int counter = 0; 
  for(int i = 0;i < N;i++){
    for(int j = bmin;j < bmax;j++){
      for(int k = 0;k < N;k++){
        if(a[i] > b[j] && b[j] > c[k])counter++;
      }
    }
  }
  System.out.println(counter);
}}