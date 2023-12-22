import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        if(a.equals("H") ^ b.equals("H")){
            System.out.println("D");
        }else{
            System.out.println("H");
        }   
    }
}

