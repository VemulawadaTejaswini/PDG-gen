import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int N = sc.nextInt();
  int ans = 0;
  char[] s = new char[N];
  for(int i = 0;i<N;i++){
    s[i] = sc.next();
  }
  for(int i = 0;i<N;i++){
    if(s[i] == 'Y'){ans += 1;}
  }
  if(ans == 0){System.out.println("Three");}
  if(ans > 0){System.out.println("Four");}
}
}
  
