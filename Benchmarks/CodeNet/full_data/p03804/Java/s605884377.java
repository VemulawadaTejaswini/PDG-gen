import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int N = sc.nextInt();
  int M = sc.nextInt();
  String[] A = new String[N];
  String[] B = new String[M];
  for(int i = 0;i < N;i++)A[i] = sc.next();
  for(int i = 0;i < M;i++)B[i] = sc.next();
    boolean exist = false;
  boolean bad = false;
  for(int i = 0;i < N-M+1;i++){
    for(int j = 0;j < N-M+1;j++){
      for(int k = 0;k < M;k++){
        if(!(B[k].equals(A[i+k].substring(j,j+M)))){
        	bad = true;
        	break;
        	}
      }
      if(!bad)exist = true;
      if(exist)break;
    }
    if(exist){
      System.out.println("Yes");
      break;
    }
  }
  if(!exist)System.out.println("No");
}}
