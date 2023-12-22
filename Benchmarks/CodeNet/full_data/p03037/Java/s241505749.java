import java.util.Scanner;



public class Main{

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n=scanner.nextInt();
    int m=scanner.nextInt();
    int num=0;
    int[] ans=new int[n+1];

    for(int i=1;i<=n;i++){
      ans[i]=1;
    }

    for(int i=1;i<=m;i++){
      int l=scanner.nextInt();
      int r=scanner.nextInt();
      for(int j=1;j<=n;j++){
        if(j<l||j>r){
          ans[j]=0;
        }
      }
    }
    for(int i=1;i<=n;i++){
      if(ans[i]==1){
        //System.out.println(i);
        num++;
      }
    }
    System.out.println(num);
    //System.out.printf("%.12f\n",ans);
  }
}
