import java.util.Scanner;

public class Main {
  public static int figure(int a){
    int count=0;
    while(a>0){
      count += a%10;
      a = a/10;
    }
    return count;
  }
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n =  scan.nextInt();
      int a =  scan.nextInt();
      int b =  scan.nextInt();
      int count =0;

      for(int i=1;i<n+1;i++){
        if(figure(i)>=a&&figure(i)<=b){
          count += i;
      }
      
      }
		System.out.println(count);
        scan.close();
  }
}
