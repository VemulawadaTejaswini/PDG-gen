import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int sel=0;
    ArrayList<Integer> a=new ArrayList<>();
    long sum=0;
    int flag=0;
    for(int i=0;i<n;i++){
      int t=sc.nextInt();
      sum+=t;
      a.add(t);
    }
    Collections.sort(a);
    sel=(int)(sum/(4*m));
    //System.out.println(sel);
    int count=0;
    for(int i=n-1;i>-1;i--){
      if(a.get(i)>=sel) count++;
      if(count==m) {
        flag=1;break;
      }
    }
	if(flag==1)System.out.println("Yes");
    else System.out.println("No");
  }
}