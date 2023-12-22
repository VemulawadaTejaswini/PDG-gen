import java.util.Scanner;

public class Main {

    public static  void main(String args[]){
        Scanner scanner = new Scanner(System.in);
       int x = scanner.nextInt();
       double ans = 1;
       for (int i = 2; i < x; i++){
           for(int j = 2; Math.pow(i,j) <= x; j++){
               if(ans < Math.pow(i,j)){
                   ans = Math.pow(i,j);
               }
           }
       }
       System.out.println((int)ans);
    }
}
