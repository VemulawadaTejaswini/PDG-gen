import java.util.Arrays;
import java.util.*;

public class Main{

         public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);
                int N = scan.nextInt();
                int array[] = new int[N+1];
                int result=0;

                for(int i=0 ; i < N ; i++){
                        array[i]=scan.nextInt();
                }
                array[N]=0;

                for(int i=N ; i > 0 ; i--){
                        if(array[i]<array[i-1]){
                                result+=array[i-1]-array[i];
                        }
                }

                System.out.println(result);
         }
}