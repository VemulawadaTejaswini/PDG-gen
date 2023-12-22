import java.util.Scanner;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int sum = 0;
  int[] w = new int[n]; 
  for(int i = 0; i < n;i++){
    w[i] = sc.nextInt();
    sum += w[i];
  }
  int sf = 0;
  int ss = w[0];
  for(int i = 0;;i++){
    sf += w[i];
    ss += w[i+1];
    if(ss > ((sum+1)/2)+1){
      break;
    }
  }
  System.out.println(Math.abs(sum - sf*2));
}}