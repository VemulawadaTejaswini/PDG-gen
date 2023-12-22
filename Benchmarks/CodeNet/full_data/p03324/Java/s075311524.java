import java.util.*;
class Main{

public static void main(String[] args){

Scanner s = new Scanner(System.in);
long d = s.nextInt() , n = s.nextInt();
long ans = (long)Math.pow(10,d);
System.out.println(ans*n);
}
}