import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        int maxdis=0;
        int i=1;

        while(true){
            maxdis=maxdis + i;
            if(maxdis >= x){
                System.out.println(i);
                break;
            }
            else{
                i++;
            }
        }


    }
}
