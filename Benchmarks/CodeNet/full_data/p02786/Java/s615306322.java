import java.util.*;

class Main{

  public static void main(String args[]){

    Scanner s=new Scanner(System.in);
    long H=s.nextLong();
    long cnt=0;
    long plus=1;
    for(;;){
    if(H==1) break;
    H/=2;
    cnt+=plus;
    plus*=2;
    }
    System.out.println(cnt+plus);
  }  
}