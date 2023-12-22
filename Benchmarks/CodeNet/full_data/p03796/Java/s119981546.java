import java.util.*;

class Main {
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
long ans = 1;
for(int i = 1;i <= n;i++){
  ans *= i;
}
ans = ans % ( 1000000007);
System.out.println(ans);

}
}