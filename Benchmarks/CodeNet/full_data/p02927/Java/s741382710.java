import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int m = scn.nextInt();
      	int d = scn.nextInt();
		int count = 0;
		for(int i=2; i<=m; ++i){
          for(int j=21; j<=d; ++j){
            int jj = j%10;
            int jjj = j/10;
            if(jj>=2 && jj*jjj==i){
              count = count + 1;
            }
          }
		}
      System.out.println(count);
	}
}
