import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int P = sc.nextInt();
        
        if(3 > ((A*3)+P)/2) {
        	System.out.println(0);
        }else {
        	System.out.println(((A*3)+P)/2);
        }
    }
}