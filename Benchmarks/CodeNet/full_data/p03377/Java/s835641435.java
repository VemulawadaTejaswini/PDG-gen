import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int  a = s.nextInt();
        int  b = s.nextInt();
        int  x = s.nextInt();

        if(a<=x&&x<a+b){
        	System.out.println("YES");
        }
        else{
        	System.out.println("NO");
        }
        s.close();
    }
}
