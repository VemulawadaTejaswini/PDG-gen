import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String[] s=sc.next().split(""),ops={"+","+","+"};
  	int[] n=new int[4];
    int sum=0;
    for(int i=0;i<4;i++){
      n[i]=Integer.parseInt(s[i]);
      sum+=n[i];
    }
    int f=sum,j=1;
    if(sum==7){
      System.out.println(s[0]+"+"+s[1]+"+"+s[2]+"+"+s[3]+"=7");
    }else{
      do{
        for(int i=j;i<4;i++){
          if(sum-a[i]<7){
            sum=f;
            j++;
            ops[0]="+";
            ops[1]="+";
            ops[2]="+";
            break;
          }else{
            sum=sum-a[i];
            ops[i-1]="-";
            if(sum==7){
              break;
            }
          }
        }
      }while(sum!=7);
      System.out.println(s[0]+ops[0]+s[1]+ops[1]+s[2]+ops[2]+s[3]+"=7");
    }
  }
}
