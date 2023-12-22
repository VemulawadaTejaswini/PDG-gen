import java.util.*;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int Q = sc.nextInt();
      String S = sc.next();
      int len = S.length();
      int[] z = new int[len];
      boolean flag = false;
      int count = 0;
      for(int i=0;i<len;i++){
        if("A".equals(S.substring(i,i+1))){
          flag = true;
        }
        if(flag && "C".equals(S.substring(i,i+1))){
          z[i] = ++count;
        }else{
          z[i] = count;
          flag = false;
        }
      }
      for(int i=0;i<Q;i++){
        int l = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(z[r]-z[l]);
      }
	}
}