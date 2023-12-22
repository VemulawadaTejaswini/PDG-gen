import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt(),b=in.nextInt(),c=in.nextInt(),d=in.nextInt();
        if(a+b==c+d){
            System.out.println("Balanced");
        }else if(a+b>c+d){
            System.out.println("Left");
        }else {
            System.out.println("Right");
        }
    }
}