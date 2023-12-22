import java.util.*;
import java.lang.Math;

class Main {
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
long ans = 1;
for(int i = 1;i <= n;i++){
  ans *= i;
}
ans = ans % (Math.pow(10,9) + 7);
System.out.println(ans);

}
}