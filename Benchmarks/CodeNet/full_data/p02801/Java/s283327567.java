import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String C = sc.next();
        char c = C.charAt(0);
        
        System.out.println(++c);
    }
}