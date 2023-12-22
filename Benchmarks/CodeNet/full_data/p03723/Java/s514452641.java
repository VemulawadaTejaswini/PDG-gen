import java.io.*;
import java.util.*;

public class Main{
    public void run(){
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String[] arg = br.readLine().split(" ");
            int a = Integer.parseInt(arg[0]);
            int b = Integer.parseInt(arg[1]);
            int c = Integer.parseInt(arg[2]);
            int count = 0;
            int nexta = a;
            int nextb = b;
            int nextc = c;
            while(true){
                if(a == b || b == c || a == c){
                    count = -1;
                    break;
                }
                if(a % 2 == 1 || b % 2 == 1 || c % 2 == 1)break;

                nextb += a / 2;
                nextc += a / 2;
                nexta -= a;

                nexta += b / 2;
                nextc += b / 2;
                nextb -= b;

                nexta += c / 2;
                nextb += c / 2;
                nextc -= c;
                count++;

                a = nexta;
                b = nextb;
                c = nextc;

            }
            System.out.println(count);
        }catch(Exception e){

        }
    }
    public static void main(String... args){
        new Main().run();
    }
}
