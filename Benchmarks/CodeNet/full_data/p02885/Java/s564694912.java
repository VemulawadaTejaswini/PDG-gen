package abc143;

import java.util.Scanner;

public class ABC143A {

public static void main(String args[]) {

Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b_in = sc.nextInt();
int b =2 * b_in;
  
int result = 0;
  
  if(b <= a){
    result = a - b;
  }
  
System.out.println(result);
}
}
