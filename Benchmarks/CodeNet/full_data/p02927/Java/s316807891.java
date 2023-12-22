import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int D = sc.nextInt();
int d1 = 0;
int d10 = 0;
int count = 0; 
        for(int i = 1; i <= M; i++){
            for(int j = 1; j <= D; j++){
                d1 = j%10;
                d10 = j/10;
                if(d1 != 1 && d10 != 1 && d1 * d10 == i){
                        count++;
                    }
                }
            }
        System.out.println(count);
    }
}