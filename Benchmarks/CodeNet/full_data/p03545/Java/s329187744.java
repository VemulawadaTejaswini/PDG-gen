import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int A = Integer.parseInt(String.valueOf(str.charAt(0)));
        int B = Integer.parseInt(String.valueOf(str.charAt(1)));
        int C = Integer.parseInt(String.valueOf(str.charAt(2)));
        int D = Integer.parseInt(String.valueOf(str.charAt(3)));
        if (A+B+C+D==7){
            System.out.println(String.format("%d+%d+%d+%d=7", A,B,C,D));
        } else if (A-B+C+D==7){
            System.out.println(String.format("%d-%d+%d+%d=7", A,B,C,D));
        } else if (A+B-C+D==7){
            System.out.println(String.format("%d+%d-%d+%d=7", A,B,C,D));
        } else if (A+B+C-D==7){
            System.out.println(String.format("%d+%d+%d-%d=7", A,B,C,D));
        } else if (A-B-C+D==7){
            System.out.println(String.format("%d-%d-%d+%d=7", A,B,C,D));
        } else if (A-B+C-D==7){
            System.out.println(String.format("%d-%d+%d-%d=7", A,B,C,D));
        } else if (A+B-C-D==7){
            System.out.println(String.format("%d+%d-%d-%d=7", A,B,C,D));
        } else {
            System.out.println(String.format("%d-%d-%d-%d=7", A,B,C,D));
        }
    }
}