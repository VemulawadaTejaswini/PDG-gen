import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int N=scan.nextInt();
    int[] H=new int[N];
    for(int i=0;i<N;i++){
      H[i]=scan.nextInt();
    }
    int count=0;
    int max=count;
    int now=H[0];
    for(int i=0;i<N-1;i++){
      now=H[i];
      for(int j=i+1;j<N;j++){
        if(now>=H[j]){
          count++;
        }else{
          break;
        }
      }
      if(max<count){
        max=count;
      }
      count=0;
    }
    System.out.println(max);
  }
}