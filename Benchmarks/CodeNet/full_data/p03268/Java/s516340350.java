import java.util.Scanner;
public class mine{
 public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int k=in.nextInt();
    int[]cnt=new int[k];
    for(int i=1;i<=n;i++){
      cnt[i%k]++;
    }
    long ans=1L*cnt[0]*cnt[0]*cnt[0];
    if(k%2==0){
      ans+=1L*cnt[k/2]*cnt[k/2]*cnt[k/2];
    }
    System.out.println(ans);
 }
}