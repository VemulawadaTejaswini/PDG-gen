import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int Bills = scn.nextInt();
        int Sum = scn.nextInt();

        if(Check(Sum, Bills) == 1){
            System.out.println("-1 -1 -1");
        }
    }

    public static int Check(int Y, int N){

        for(int x=0; x<=N; x++){
            for(int y=0; y<=N-x; y++){
                int z = N-x-y;
                if(x*10000 + y*5000 + z*1000 == Y){
                    System.out.println(x + " " + " " + y + " " +z);
                    return 0;
                }
            }
        }
        return 1;
    }
}