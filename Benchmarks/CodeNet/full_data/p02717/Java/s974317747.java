import java.util.*;

public class c{
  public statjic void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    
    int tmp = a; // 1
    a = b; // 2
    b = tmp; // 1
    
    tmp = a;
    a = c;
    c = a;
    
    System.out.println(a+" "+b+" "+c);
  }
}