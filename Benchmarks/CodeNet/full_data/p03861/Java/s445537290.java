import java.util.*;

class Main {
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
long a = sc.nextLong();
long b = sc.nextLong();
long x = sc.nextLong();
long ax;
if(a != 0){
ax = (a -1) / x;
}else{
ax = 0;
}
long bx = b / x;
long ans = bx - ax;
if(ans == 0&&a % x == 0){
ans == 1;
}
System.out.println(ans);


}
}