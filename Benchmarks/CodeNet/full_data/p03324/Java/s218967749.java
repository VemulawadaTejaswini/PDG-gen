import java.util.Scanner;

class Main{
	public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int n = sc.nextInt();
        sc.close();
        if(n == 100){
            n++;
        }
        System.out.println(Math.pow(100,d)*n);
    }
}