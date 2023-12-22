import java.util.*;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        int k = scan.nextInt();
        int s = scan.nextInt();


        // search
        int count = 0;
        for(int x = 0; x <= s; x++){
            for(int y = 0; y <= s; y++){
                for(int z = 0; z <= s; z++){
                    if(x + y + z == s){
                        count++;
                    }
                }
            }
        }


        // answer
        System.out.println(count);

    }
}