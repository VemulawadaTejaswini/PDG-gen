import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int l=sc.nextInt();
    String str[]=new String[n];
    for(int i=0;i<n;i++){
      str[i]=sc.next();//なぜsc.nextLineじゃダメなのかは不明
    }
    Arrays.sort(str);
    for(int i=0;i<n;i++){
      System.out.print(str[i]);
    }
  }
}