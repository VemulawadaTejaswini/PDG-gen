import java.util.*;

public class Main{
    public static void main(String args[]){
        String name = "";
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        if(r < 1200){
            name = "ABC";
        }else if(r < 2800){
            name = "ARC";
        }else{
            name = "AGC";
        }
        System.out.println(name);
    }
}