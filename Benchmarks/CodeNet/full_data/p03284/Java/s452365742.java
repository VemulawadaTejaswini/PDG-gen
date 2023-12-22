import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int D = scan.nextInt();
        int G = scan.nextInt();
        if(D%G == 0)System.out.println("0");
        else System.out.println("1");

    }
}
