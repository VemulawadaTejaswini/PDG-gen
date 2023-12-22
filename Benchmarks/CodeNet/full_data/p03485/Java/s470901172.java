import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
double a=Double.parseDouble(sc.next());
double b=Double.parseDouble(sc.next());
double x=Math.ceil((a+b)/2);
x=(int)x;
System.out.println(x);
}
}