import java.util.*;
public class Main {
public static void main(String[] args){
Scanner s=new Scanner(System.in);
  int a=s.nextInt();
  int b=s.nextInt();
  if(a<2*b)
    System.out.println(0);
  else{
  System.out.println(a-2*b);
  }
}
}