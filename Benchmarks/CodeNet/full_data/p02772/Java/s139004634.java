import java.util.*;


public class Main {

    public static void main(String[] args) {
      Scanner reader=new Scanner(System.in);
      int n=reader.nextInt();
      int a[]=new int [n];
      boolean ans=true;
      for(int i=0;i<n;i++)
      {
        a[i]=reader.nextInt();
        if(a[i]%2==0){

        if(!(a[i]%5==0||a[i]%3==0))
      {
          System.out.println("DENIED");
          return;

      }
    }
  }
      System.out.println("APPROVED");




}
}