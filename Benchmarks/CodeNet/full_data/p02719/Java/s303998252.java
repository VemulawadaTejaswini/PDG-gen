import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long x =sc.nextLong();
        long k =sc.nextLong();
        while (true){
            x=Math.abs(x-k);
            if(x<k)
                break;
        }
        System.out.println(Math.abs(x-k));









     }
}
