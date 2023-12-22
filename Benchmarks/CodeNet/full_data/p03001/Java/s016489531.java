import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = Integer.parseInt(sc.next());
        int h = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());
        double s = (double)h*w/2.0;
        if(w==2*x && h==2*y){
            System.out.print(s+" "+1);
        }else{
            System.out.print(s+" "+0);
        }
        sc.close();
    }
}