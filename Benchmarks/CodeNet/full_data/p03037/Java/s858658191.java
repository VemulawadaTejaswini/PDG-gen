import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int l[] = new int[m];
    int r[] = new int[m];
    for(int i=0;i<m;i++){
      l[i]=sc.nextInt();
      r[i]=sc.nextInt();
    }
    Arrays.sort(l);
    Arrays.sort(r);
    int answer = r[0]-l[m-1]+1;
    if(answer<0){
      answer=0;
    }
    System.out.println(answer);
  }
}