import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int N = sc.nextInt();
    int array[] =new int[N];
    for(int i=0; i<N; i++){
      array[i]=sc.nextInt();
    }
    int idx=1;
    int cnt=0;
    while(cnt<100002){
      cnt++;
      if(array[idx-1]==2){
        break;
      }else if(cnt<100001){
        idx=array[idx-1];
    }else{
        cnt=-1;
        break;
     }
    }
    System.out.println(cnt);
  }  
}