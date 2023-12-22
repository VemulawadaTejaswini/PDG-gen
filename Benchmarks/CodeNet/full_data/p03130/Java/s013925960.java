import java.util.Scanner;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int[] a = new int[4];
  for(int i = 0;i < 6;i++){
    int b = sc.nextInt();
    a[b]++;
  }
  boolean n = true; 
  for(int i = 0;i < 4;i++){
    if(a[i] >= 3){
      n = false;
      break;
    }
  }
  System.out.println(n ? "YES":"NO");
}}
    