import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x == 2 || y == 2) {
            System.out.println("No");
        } else {
            switch(x){
                case 4:
                case 6:
                case 9:
                    switch(y){
                        case 6:
                        case 9:
                        case 11:
                            System.out.println("Yes");
                            break;
                        default :
                            System.out.println("No");
                    }
                    break;
                default:
                    switch(y){
                        case 4:
                        case 6:
                        case 9:
                        case 11:
                            System.out.println("No");
                            break;
                        default :
                            System.out.println("Yes");
                    }
            }
        }
    }
}