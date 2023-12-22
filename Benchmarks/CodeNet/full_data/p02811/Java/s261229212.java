import java.util.Scanner;

public class Adcoder {
    public static void main(String[] args) {
        Scanner I =new Scanner(System.in);
        float K=I.nextFloat();
        Scanner J=new Scanner(System.in);
        float X=J.nextFloat();
        if(K*500<X){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }
    }
}
