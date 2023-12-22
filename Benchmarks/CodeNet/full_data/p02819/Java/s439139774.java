import java.util.Scanner;

public class asuka {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long X = sc.nextLong();

        int i =0;
        loop : while(true){
            X = X+i;
            for(int k=2; k<X;k++){
                if(X%k==0){
                    break;
                }
                if(k == X-1){
                    System.out.println(X);
                    break loop;
                }
            }
            i++;
        }
    }


}
