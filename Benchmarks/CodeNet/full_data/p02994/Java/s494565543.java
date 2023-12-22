import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n=scanner.nextInt();
    int l=scanner.nextInt();
    int aji[]=new int[n];

    for(int i=0;i<n;i++){
      aji[i]=l+i;
    }
    int ans=0;
    if(aji[0]>=0&&aji[n-1]>0){
      for(int i=1;i<n;i++){
        ans+=aji[i];
      }
    }

    if(aji[0]<0&&aji[n-1]>0){
      for(int i=0;i<n;i++){
        if((aji[0]>=0&&aji[n-1]>0)||(aji[0]<0&&aji[n-1]<0)){
          ans+=aji[i];
        }
      }
    }

    if(aji[0]<0&&aji[n-1]<=0){
      for(int i=0;i<n-1;i++){
        ans+=aji[i];
      }
    }


    System.out.println(ans);
  }
}
