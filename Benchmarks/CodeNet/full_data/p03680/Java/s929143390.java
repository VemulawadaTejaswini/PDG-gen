import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] nums=new int[n];
    for(int i=0;i<n;i++){
      nums[i]=sc.nextInt();
    }
    boolean[] turned=new boolean[n];
    turned[0]=true;
    int now=1;
    int turns=0;
    while(true){
      turns++;
      now=nums[now-1];
      if(turned[now-1]){
        System.out.println(-1);
        return;
      }else if(now==2){
        System.out.println(turns);
        return;
      }
      turned[now-1]=true;
    }
  }
}