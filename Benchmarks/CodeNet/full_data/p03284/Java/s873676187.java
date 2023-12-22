import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int cookie = scan.nextInt();
        int number = scan.nextInt();
        int rest = 0;
        
        if(cookie >=number ){
            rest = cookie % number;
            if(rest < number){
                rest = 1;
            }
        }else{
            rest = 1;
        }
        System.out.println(rest);
    }
}
