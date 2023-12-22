import java.util.*;
public class Main{
  public static void main(String[] args){
    int i,j;
    int tmp=0;
    int ans=0;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n-1];//2~n->0~n-2
    List<Integer> loser=new ArrayList<Integer>();
    for(i=0;i<n-1;i++){
      a[i]=sc.nextInt();
      if(a[i]==1)loser.add(i);
    }
    for(i=0;i<loser.size();i++){
      tmp=0;
      for(j=0;j<n-1;j++){
        if(a[j]=loser.get(i))tmp++;
      }
      ans=Math.max(tmp,ans);
    }
    System.out.println(ans);
  }
}
