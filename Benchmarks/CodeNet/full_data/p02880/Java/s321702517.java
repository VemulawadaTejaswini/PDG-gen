import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner Ent = new Scanner(System.in);
        int number = Ent.nextInt();
        boolean a = true;
        for (int i = 1; i < 10; i++) {
            if( number % i == 0){
                int cociente = number / i;
                if(cociente>0 && cociente<10){
                    System.out.println("Yes");
                    a = false;
                    break;
                }
            }
        }
        if(a){
            System.out.println("No");
        }

    }
}