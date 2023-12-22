import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double w = Double.parseDouble(sc.next());
        double h = Double.parseDouble(sc.next());
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());
        
        double s = w*h/2;
        System.out.print(s);
        
        if((x*2 == w) && (y*2 == h)){
            System.out.println(" 1");
        }else{
            System.out.println(" 0");
        }
    }
}