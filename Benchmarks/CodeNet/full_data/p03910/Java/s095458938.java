import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int p = 0;
    for(int k = 1;k<=n;k++){
      if(k*(k+1)/2>=n){
        p=k;
        break;
      }
    }
    int[] res = new int[p+1];
    for(int i = 1;i <= p;i++)res[i]=i;
    if(n!=p*(p+1)/2)res[p*(p+1)/2-n]=0;
    for(int i = 1;i <= p;i++)
      if(res[i]!=0)System.out.println(res[i]);
  }
}