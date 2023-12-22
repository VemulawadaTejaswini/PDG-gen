import java.util.*;

public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
long a = sc.nextInt();
long b = sc.nextInt();
long x = sc.nextInt();
long cnt = b / x - a / x;
if(a % x ==0){
     cnt++;
}
        
        System.out.println(cnt);
    }
}
