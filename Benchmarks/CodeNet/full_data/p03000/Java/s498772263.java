import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        int n = t.nextInt();
        int x = t.nextInt();
        int i, l, d, lant, dant = 0, cont = 1;
        l = t.nextInt();
        lant = l;
        for (i = 0; i < n; i++) {
            l = t.nextInt();
            d = dant + lant;
            if (d > x){
                System.out.println(cont);
                break;
            } else if (d == x){
                cont++;
                System.out.println(cont);
                break;
            } else {
                lant = l;
                dant = d;                    
                cont++;
            }
        }
    }   
}