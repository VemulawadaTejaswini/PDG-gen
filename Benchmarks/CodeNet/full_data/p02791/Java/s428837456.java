import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int min=Integer.MAX_VALUE;
        int sum=0;
      for(int i=0;i<n;i++)
      {
          int a=sc.nextInt();
          if(a<min)
          {
              min=a;
              sum++;
          }
      }
        System.out.println(sum);
    }
}
