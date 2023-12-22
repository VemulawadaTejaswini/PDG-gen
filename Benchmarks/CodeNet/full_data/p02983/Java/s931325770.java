
import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int L = stdIn.nextInt(); int R = stdIn.nextInt();
        int answer = 2018;
        if( R - L + 1 >= 673) answer = 0;
        else{
            for(int i = L; i <= R -1; i++){
                for(int j = i + 1; j <= R; j++){
                    if(answer > (i % 2019) * (j % 2019) % 2019){
                        answer = (i % 2019) * (j % 2019) % 2019;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}