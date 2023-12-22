import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[]array=str.split("");
        if(array[0].equals(array[2]) && array[1].equals(array[2]))
        System.out.println("No");
        else
        System.out.println("Yes");
     }
}