import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 0;
        int sum = 0;

        while(i<N){
            if(((i % 3) == 0) && ((i % 5) == 0)){
            }
            else if(i % 5 == 0){
            }
            else if(i % 3 == 0){

            }else{
                sum += i;
            }
            i++;
        }
        System.out.println(sum);
    }
}