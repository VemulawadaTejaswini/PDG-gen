import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    String[] str=new String[N];
    int[] count=new int[N];
    
    for(int i=0;i<N;i++){
      count[i]=0;
    }
    
    int max=0;
    
    for(int i=0;i<N;i++){
      String tmp=sc.next();
      int j;
      for(j=0;j<max;j++){
        if(str[j].equals(tmp)){
          count[j]++;
          break;
        }
      }
      if(j>=max-1){
          str[max]=tmp;
          count[max++]=1;
        }
    }
    
    int answer=0;
    for(int i=0;i<=max;i++){
      if(answer<count[i]){
        answer=count[i];
      }
    }
    
    for(int i=0;i<=max;i++){
      if(count[i]==answer){
        System.out.println(str[i]);
      }
    }
  }
}
