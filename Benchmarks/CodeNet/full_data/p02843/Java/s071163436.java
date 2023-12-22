import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x= scan.nextInt();
        int xLen = String.valueOf( x ).length();
        int y=x;
        int cnt=0;
        while(true){
          cnt++;
          if(y>=105)y-=105;
          else if(y>=104)y-=104;
          else if(y>=103)y-=103;
          else if(y>=102)y-=102;
          else {
            y-=101;
            if(y<=100)break;
          }
        }
        if(y==100)System.out.println("1");
        else System.out.println("0");
        scan.close();
    }
}