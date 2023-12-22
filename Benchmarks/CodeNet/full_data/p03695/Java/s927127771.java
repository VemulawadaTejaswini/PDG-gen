import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=sc.nextInt(),min=0,max=0,f=0;
    int[] a=new int[n],color=new int[8];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
      if(a[i]<400&&color[0]==0){
        color[0]++;
        min++;
        max++;
        f++;
      }else if(a[i]>=400&&a[i]<800&&color[1]==0){
        color[1]++;
        min++;
        max++;
        f++;
      }else if(a[i]>=800&&a[i]<1200&&color[2]==0){
        color[2]++;
        min++;
        max++;
        f++;
      }else if(a[i]>=1200&&a[i]<1600&&color[3]==0){
        color[3]++;
        min++;
        max++;
        f++;
      }else if(a[i]>=1600&&a[i]<2000&&color[4]==0){
        color[4]++;
        min++;
        max++;
        f++;
      }else if(a[i]>=2000&&a[i]<2400&&color[5]==0){
        color[5]++;
        min++;
        max++;
        f++;
      }else if(a[i]>=2400&&a[i]<2800&&color[6]==0){
        color[6]++;
        min++;
        max++;
        f++;
      }else if(a[i]>=2800&&a[i]<3200&&color[7]==0){
        color[7]++;
        min++;
        max++;
        f++;
      }else if(a[i]>=3200){
        if(i==0){
          min++;
          max++;
        }else{
          max++;
        }
      }
    }
    if(n>=2){
      if(a[0]>=3200&&f>0){
        min--;
      }
    }
    System.out.println(min+" "+max);
  }
}
