import java.util.Scanner;
import java.util.HashMap;


public class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n=scanner.nextInt();
    int a[]=new int[n];
    int flg=0;
    int cmd=0;
    int ans=0;
    HashMap<Integer,Integer> num=new HashMap<Integer,Integer>();
    int x[]=new int[n];
    int y[]=new int[n];
    int cnt=0;

    for(int i=0;i<n;i++){
      a[i]=scanner.nextInt();
    }

    for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                if (a[j - 1] > a[j]) {
                    int tmpNum = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = tmpNum;
                }
            }
    }

    /*for(int i=0;i<n;i++){
      System.out.println(a[i]);
    }*/

    for(int i=0;i<n-1;i++){
      if(a[i]<=0&&a[i+1]>0){
        flg=1;
        cmd=i;
      }
    }

    if(flg==1){
      //System.out.println(a[cmd]+" "+a[cmd+1]);
      x[cnt]=a[cmd];
      y[cnt]=a[cmd+1];
      cnt++;
      ans=a[cmd]-a[cmd+1];
      for(int i=cmd+2;i<n-1;i++){
        x[cnt]=ans;
        y[cnt]=a[i];
        cnt++;
        //System.out.println(ans+" "+a[i]);
        ans=ans-a[i];
      }
      //System.out.println(a[n-1]+" "+ans);
      x[cnt]=a[n-1];
      y[cnt]=ans;
      cnt++;
      ans=a[n-1]-ans;
      for(int i=0;i<cmd;i++){
        x[cnt]=ans;
        y[cnt]=a[i];
        cnt++;
        //System.out.println(ans+" "+a[i]);
        ans=ans-a[i];
      }
    }
    else{
      if(a[0]<0){
        for(int i=0;i<n/2;i++){
          int tmp=a[i];
          a[i]=a[n-1-i];
          a[n-1-i]=tmp;
        }

        ans=a[0];
        for(int i=1;i<n-1;i++){
          x[cnt]=ans;
          y[cnt]=a[i];
          cnt++;
          ans=ans-a[i];
        }
        x[cnt]=ans;
        y[cnt]=a[n-1];
        cnt++;
        ans=ans-a[n-1];

      }
      else{
        ans=a[0];
        for(int i=1;i<n-1;i++){
          x[cnt]=ans;
          y[cnt]=a[i];
          cnt++;
          ans=ans-a[i];
        }
        x[cnt]=a[n-1];
        y[cnt]=ans;
        cnt++;
        ans=a[n-1]-ans;
      }
    }

    System.out.println(ans);

    for(int i=0;i<n-1;i++){
      System.out.println(x[i]+" "+y[i]);
    }
  }
}
