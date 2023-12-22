import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        
        boolean[] ans = new boolean[4];
        
        ans[scan.nextInt()] = true;
        ans[scan.nextInt()] = true;
        
        for(int i = 1; i <4; i++){
            if(!ans[i]){
                out.println(i);
            }
        }
        out.close();
        
    }
}