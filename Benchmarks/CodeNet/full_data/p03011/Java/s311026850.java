import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc =  new Scanner(System.in);
  int ab = sc.nextInt();
  int bc = sc.nextInt();
  int ca = sc.nextInt();
  int  abc= ab+bc;
  int  bca= bc+ca;
  int  cab= ca+ab;
  int min=0;
  if(abc<bca)min=abc;
  else min=bca;
  if(min>cab) min=cab;
  System.out.println(min);
}
}