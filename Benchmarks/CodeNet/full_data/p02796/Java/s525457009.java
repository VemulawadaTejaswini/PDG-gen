import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    long[] place=new long[N];
    long[] arm=new long[N];
	long[] plus=new long[N];
    long[] minus=new long[N];
    int count=0;
    
    for(int i=0;i<N;i++){
      place[i]=sc.nextLong();
      arm[i]=sc.nextLong();
    }
    
    for(int i=0;i<N;i++){
      plus[i]=place[i]+arm[i];
      minus[i]=place[i]-arm[i];
    }
    
    long max=plus[0];
    long min=minus[0];
    
    for(int i=0;i<N;i++){
      if(plus[i]>max) max=plus[i];
      if(minus[i]<min) min=minus[i];
    }
    
    for(int j=0;j<N;j++){
      for(int k=0;k<N;k++){
        if((minus[k]<minus[j]&&minus[j]<plus[k])||(minus[k]<plus[j]&&plus[j]<plus[k])){
          if(arm[k]<arm[j]){
            arm[j]=0;
            minus[j]=place[j];
            plus[j]=place[j];
          }else{
            arm[k]=0;
            minus[k]=place[k];
            plus[k]=place[k];
          }
            count++;
        }
      }
    }
    
    System.out.println(count);
    
  }
}