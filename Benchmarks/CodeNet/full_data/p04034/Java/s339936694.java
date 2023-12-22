import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] box = new int[n];
    int[] red = new int[n];
    for(int i = 0;i<n;i++){
      box[i] = 1;
    }
    red[0]++;
    for(int i = 0;i<m;i++){
      int x = sc.nextInt()-1,y = sc.nextInt()-1;
      if(red[x]==1)red[y]=1;
      box[x]--;
      box[y]++;
      if(box[x]==0){
        red[x]=0;
      }
    }
    int count = 0;
    for(int i:red){
      if(i == 1)count++;
    }
    System.out.println(count);
  }
}
