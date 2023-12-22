import java.util.*;

public class Main {

		public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
        int X = sc.nextInt();
          for (int i = X-(K-1); i <= X+(K-1); i++) {
            if(i>100) break;
            if(i<-100) continue;
           System.out.print(i + " "); 
          }
	}
}
