import java.util.*;
public class Main{
public static void main(String[] args){
Scanner stdIn = new Scanner(System.in);
  int n = stdIn.nextInt();
 int k = stdIn.nextInt();
int ans = 1;

for(int i = 0; i < n; i++){
  if(ans*2- ans > k){
       ans += k;
}else{
  ans *=2;
}
}
  System.out.println(ans);
  
}
}