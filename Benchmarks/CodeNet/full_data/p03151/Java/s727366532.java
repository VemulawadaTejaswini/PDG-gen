import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      long[] a = new long[n];
      long[] b = new long[n];
      long[] c = new long[n];
      long sum = 0;
      int cnt = 0;
      ArrayList<Integer> list =new ArrayList<>();
      for(int i = 0;i < n;i++)a[i]=sc.nextLong();
      for(int i = 0;i < n;i++){
        b[i]=sc.nextLong();
        c[i]=a[i]-b[i];
        if(c[i]>0)list.add((int)c[i]);
        else if(c[i]==0){}
        else{
          sum+= (-1)*c[i];
          cnt++;
        }
      }
      Collections.sort(list,Collections.reverseOrder());
      int sb = list.size();
      while(sum>0&&list.size()>0){
      	long h = (long)list.get(0);
        list.remove(0);
        if(h<=sum){
          sum-=h;
        }else{
          sum=0;
        }
      }
      int sa = list.size();
      if(sum>0)System.out.println(-1);
      else System.out.println(cnt+sb-sa);
    }
}
