import java.util.*;
 
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int k = sc.nextInt();
    int s = sc.nextInt();
    int ans = 0;
    for(int i=0; i<=k; i++){
      for(int j=0; j<=k; j++){
        for(int h=0; h<=k; h++){
          int sum = i+j+h;
          if(sum == s){
            ans++;
          }
        }
      }
    }
    System.out.println(ans);

    sc.close();
  }
}
