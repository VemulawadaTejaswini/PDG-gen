import java.util.*;

public class Maina{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int A = sc.nextInt();

        if(H%A==0){
            System.out.println(H / A);
        }
        else if(H%A!=0){
            System.out.println(H /A + 1);
        }
    }
}