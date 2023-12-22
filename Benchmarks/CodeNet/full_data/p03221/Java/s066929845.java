import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      Map<Integer,int[]> map = new TreeMap<Integer,int[]>();
      for(int i = 0;i < m;i++){
      	int[] ary = new int[2];
        ary[0]=sc.nextInt();
        ary[1]=i;
        int b = sc.nextInt();
        map.put(b,ary);
      }
      int[] pary = new int[n];
      String[] ans = new String[m];
      for(int[] num:map.values()){
      	pary[num[0]-1]++;
        ans[num[1]]=String.format("%06d%06d",num[0],pary[num[0]-1]);
      }
      StringBuilder sb = new StringBuilder();
      for(String s:ans){
      	sb.append(s+"\n");
      }
      System.out.println(sb.toString());
    }
}