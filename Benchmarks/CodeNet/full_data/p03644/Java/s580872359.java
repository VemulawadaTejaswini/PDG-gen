import java.util.*;
 
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int ans = 1;
    int count = 0;
    int x = 0;
    int n = sc.nextInt();
    for(int i=1; i<=n; i++){
      if(i%2 == 0){
        x = countHalf(i);
        if(count < x){
          count = x;
          ans = i;
        }
      }
    }
    System.out.println(ans);

    sc.close();
  }

  public static int countHalf(int i){
    int count = 0;
    boolean a = true;
    while(a){
      if(i%2 == 0){
        i /= 2;
        count++;
      } else {
        a = false;
      }
    }
    return count;
  }
}
