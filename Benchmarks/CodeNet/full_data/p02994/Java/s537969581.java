import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n=scanner.nextInt();
    int l=scanner.nextInt();
    int aji[]=new int[n];
    int num[]=new int[n];
    int max=0;
    int ans=100000;
    int a=0;

    for(int i=0;i<n;i++){
      aji[i]=l+i;
    }

    for(int i=0;i<n;i++){
      max+=aji[i];
    }

    for(int i=0;i<n;i++){
      num[i]=max-aji[i];
    }

    for(int i=0;i<n;i++){
      if(ans>Math.abs(max-num[i])){
        a=num[i];
        ans=Math.abs(max-num[i]);
      }
    }


    System.out.println(a);
  }
}
