import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        if(N%7 == 0 || N%4 == 0){
            System.out.println("Yes");
            System.exit(0);
        }
        while(N>=4){
            N -= 4;
            if(N%7 == 0){
                System.out.println("Yes");
                System.exit(0);
            }
        }
        System.out.println("No");
    }
}
