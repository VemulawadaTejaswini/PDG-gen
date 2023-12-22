import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int x = Integer.parseInt(s.next());
        int k = Integer.parseInt(s.next());
        int temp = 0;
        int min = 0;
        while(true) {
            temp = x;
            x = x - k;
            
            
            if(x<=0) {
                x = Math.abs(x);
                if(x<=temp) {
                    System.out.println(x.toString());
                } else {
                    System.out.println(temp.toString());
                }
                break;
            }
            
        }
    }
}