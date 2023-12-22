import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double a = Double.parseDouble(sc.next());
        double b = Double.parseDouble(sc.next());
        double c = Double.parseDouble(sc.next());
        
        if((a + b + (Math.sqrt(a*b) * 2)) < c){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}