import java.util.*;
class Main{
public static void main(String args[]){
Scanner sc =new Scanner(System.in);
double a=sc.nextDouble(),b=sc.nextDouble(),x=sc.nextDouble();
System.out.println(Math.toDegrees(Math.atan(2*(a*a*b-x)/(a*a*a))));
}
}