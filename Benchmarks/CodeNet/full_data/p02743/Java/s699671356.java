import java.util.*;
class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
  long a=sc.nextLong(),b=sc.nextLong(),c=sc.nextLong();
  System.out.println((4*a*b<(a+b+c)*(a+b+c))?"Yes":"No");
}
}
