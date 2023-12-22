import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int A, B, C, D;
        D = input % 10;
        input /= 10;
        C = input % 10;
        input /= 10;
        B = input % 10;
        input /= 10;
        A = input;//

        if(A+B+C+D==7){
            System.out.println(A+"+"+B+"+"+C+"+"+D+"=7");
        }
        else if(A-B+C+D==7){
            System.out.println(A+"-"+B+"+"+C+"+"+D+"=7");
        }
        else if(A+B-C+D==7){
            System.out.println(A+"+"+B+"-"+C+"+"+D+"=7");
        }
        else if(A+B+C-D==7){
            System.out.println(A+"+"+B+"+"+C+"-"+D+"=7");
        }
        else if(A-B-C+D==7){
            System.out.println(A+"-"+B+"-"+C+"+"+D+"=7");
        }
        else if(A-B+C-D==7){
            System.out.println(A+"-"+B+"+"+C+"-"+D+"=7");
        }
        else if(A+B-C-D==7){
            System.out.println(A+"+"+B+"-"+C+"-"+D+"=7");
        }
        else if(A-B-C-D==7){
            System.out.println(A+"-"+B+"-"+C+"-"+D+"=7");
        }
    }
}
