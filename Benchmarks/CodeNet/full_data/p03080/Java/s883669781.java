import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
      String s = scn.next();
      int cr = 0;
      int cb = 0;
      for(int i=0; i<n; ++i){
        if(s.charAt(i)=="R"){
          cr = cr + 1;
        }
        if(s.charAt(i)=="B"){
          cb = cb + 1;
        }
      }
      if(cr>cb){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
	}
}
