import java.util.*;


public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String b = sc.next();
        String c = sc.next();

        for(int i=0;i<a;i++){
            System.out.print(b.substring(i,i+1)+c.substring(i,i+1));
        }

    }
}