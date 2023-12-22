import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int x,y,z,num;
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();

        num = x%(y+z);
        System.out.println(num);
    }
}