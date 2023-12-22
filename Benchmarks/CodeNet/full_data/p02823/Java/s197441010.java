
import java.util.*;

class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
long n = sc.nextInt();
long a = sc.nextInt();
long b = sc.nextInt();
  if ((b-a)%2==0){
System.out.println((b-a)/2);
}else{
long c = Math.max(a-1,b-1);
long d = Math.max(n-a,n-b);
long f = Math.min(c,d);
System.out.println(f);
}
}
}