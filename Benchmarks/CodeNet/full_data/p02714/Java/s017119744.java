import java.util.*;
class Main{  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    
    int ans = 0;
    for(int i=1;i<=n-2;i++){
      for(int j=i+1;j<=n-1;j++){
        for(int k=j+1;k<=n;k++){
          if(j-i != k-j){
            if(s.charAt(i-1) != s.charAt(j-1) && s.charAt(j-1) != s.charAt(k-1) && s.charAt(i-1) != s.charAt(k-1) )
              ans += 1;
          }
        }
      }
    }
    System.out.println(ans);
  }
}