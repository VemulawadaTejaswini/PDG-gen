import java.util.Scanner;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int a = sc.nextInt();
  int b = 0;
  for(int i = 1;i <= 9;i++){
    b += (a % Math.pow(10,i))/Math.pow(10,i-1);
  }
  if(a % b == 0)System.out.println("Yes");
  else System.out.println("No");
}}