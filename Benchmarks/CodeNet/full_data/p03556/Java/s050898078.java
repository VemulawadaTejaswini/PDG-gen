import java.util.*;

public class Main {
    public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);

    Long n=sc.nextLong();

    for(long i=n;i>=1;i--){
      if(Math.sqrt(i)%1==0){
        System.out.println(i);
        break;
      }
    }


	}
}
