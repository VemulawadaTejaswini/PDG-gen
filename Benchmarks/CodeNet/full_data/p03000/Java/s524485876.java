import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int cnt = sc.nextInt();
    int bnd = sc.nextInt();
    int a[] = new int[cnt];
    int dist=0;
    int answer=1;
    for(int i=0;i<cnt;i++){
      a[i]=sc.nextInt();
    }
    for(int i=0;i<cnt;i++){
      
      dist+=a[i];
      if(dist>bnd){  
        break;
      }
      answer++;
    }
    System.out.println(answer);
  }
}