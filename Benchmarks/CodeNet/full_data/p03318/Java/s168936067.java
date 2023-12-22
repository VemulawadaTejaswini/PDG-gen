import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();

        if(K <= 8){
            for(int i = 1; i <= K; i++){
                System.out.println(i);
            }
        }
        else{
            int count = 8;

            for(int i = 1; i <= 8; i++){
                System.out.println(i);
            }


            int ll = 0;
                for(int j = 1; j < 15; j++){
                    for(int i = 1; i <= 9; i++){
                        System.out.println((long) (i * (int)Math.pow(10, j) - 1));
                        count++;
                        if(count == K){
                            ll = 1;
                            break;
                        }
                    }
                    if(ll == 1){
                        break;
                    }
                }
        }
    }
}