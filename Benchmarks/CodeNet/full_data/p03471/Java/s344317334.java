import java.util.*;

public class Main {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N   = scan.nextInt();
        int Y   = scan.nextInt();



        int n1 = 1;
        int y1 = Y;
        int difAns1 = 0;
        while(n1 <= N){

            difAns1 = y1 - 10000;

            if(difAns1 < 0){
                n1--;
              break;
            }

            y1 = difAns1;
            n1++;
        }

        if(y1 == 0) {
            n1--;
            System.out.println(n1);
            System.out.println(0);
            System.out.println(0);
            return;
        }
        
        
        
        int n2 = 1;
        int y2 = y1;
        int difAns2 = 0;
        while(n2 <= N - n1){

            difAns2 = y2 - 5000;
            if(difAns2 < 0){
                n2--;
                break;
            }

            y2 = difAns2;
            n2++;
        }

        if(y2 == 0) {
            System.out.println(n1);
            System.out.println(n2);
            System.out.println(0);
            return;
        }
        
        
        int n3 = 1;
        int y3 = y2;
        int difAns3 = 0;
        while(n3 <= N - n1 -n2){

            difAns3 = y3 - 1000;
            if(difAns3 < 0){
                n3--;
                break;
            }

            y3 = difAns3;
            n3++;
        }

        if(y3 == 0) {
            System.out.println(n1);
            System.out.println(n2);
            System.out.println(n3);
            return;
        }else{
            System.out.println(-1);
            System.out.println(-1);
            System.out.println(-1);
            return;
        }

    }
}