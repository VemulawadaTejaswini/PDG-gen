import java.util.Scanner;
import java.util.ArrayList;

class Main{
        public static void main(String args[]){
                Scanner scanner = new Scanner(System.in);
                int N = scanner.nextInt();

                String sugar = "a";

                for(int i=0;i<N;i++){
                        sugar = scanner.next();
                        if(sugar == "Y"){
                                System.out.println("Four");
                                break;
                        }
                        //System.out.println(i+"/"+N);
                }
                System.out.println("Three");
        }
}
