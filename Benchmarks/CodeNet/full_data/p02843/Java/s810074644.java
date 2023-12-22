import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x= scan.nextInt();
        int y=x%100;
      	int z=x/100;
        int cnt=0;
        while(true){
          cnt++;
          if(y>=5)y-=5;
          else if(y>=4)y-=4;
          else if(y>=3)y-=3;
          else if(y>=2)y-=2;
          else {
            y-=1;
            break;
          }
        }
        if(cnt<=z)System.out.println("1");
        else System.out.println("0");
        scan.close();
    }
}