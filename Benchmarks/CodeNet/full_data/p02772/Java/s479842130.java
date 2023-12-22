import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        String[] a =  input.readLine().split(" ");
        for(String jude1 : a ){
            int jude2 = Integer.parseInt(jude1);
            if(jude2 % 2 == 0){
                if(!(jude2 % 5 == 0 || jude2 % 3 == 0)){
                    System.out.println("DENIED");
                    return;
                }
            }
        }
        System.out.println("APPROVED");
    }
}