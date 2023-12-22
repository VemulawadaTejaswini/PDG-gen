import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      String[] info = new String[n];
      for(int i = 0;i < n;i++){
      	info[i] = sc.next()+"_"+(1100-sc.nextInt())+"_"+(i+1);
      }
      Arrays.sort(info);
      for(int i = 0;i < n;i++){
      	String[] s = info[i].split("_");
        System.out.println(s[2]);
      }
    }
}
