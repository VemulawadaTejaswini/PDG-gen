import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
 
    public static void main (String[] args){
 
        int H;
        int W;
        ArrayList<String> strList = new ArrayList<String>();
 
        Scanner scan = new Scanner(System.in);
        H = Integer.parseInt(scan.next());
        W = Integer.parseInt(scan.next());
 
        for(int i = 0; i < H; i++ ){
            strList.add(scan.next());
        }
 
        for(int i = 0; i < W+2; i++){
            System.out.print("*");
        }
        System.out.println("");
 
        for(String str : strList){
            System.out.print("*");
            System.out.print(str);
            System.out.print("*");
            System.out.println("");
        }
 
        for(int i = 0; i < W+2; i++){
            System.out.print("*");
        }
        System.out.println("");
    }
}