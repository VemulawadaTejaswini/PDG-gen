import java.util.*;

public class Main {
    public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);

    int n=sc.nextInt();
    int count=0;
    int ans=0;
    for(int i=1;i<=n;i++){
      count=0;
      for(int s=i;s>=1;s--){
        if(i%s==0){
          count++;
        }
      }
      if(i%2!=0 && count==8){
        ans++;
      }
    }
    System.out.println(ans);

	}
}
