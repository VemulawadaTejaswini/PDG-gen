import java.util.*;

public class Main {
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int ans = 0;
if(n % 2 == 0){
ans = n * n / 4;
}else{
ans = n * (n + 1) / 4;
}
System.out.println(ans);


}
}