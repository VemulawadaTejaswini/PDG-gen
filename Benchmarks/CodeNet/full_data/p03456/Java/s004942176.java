import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int x=0;
        if(b%10==0){
            x=a*10+b;
        }else {
            x = a*100+b;
        }
        double y = Math.sqrt(x);
        if(y%1==0) System.out.println("YES");
        else System.out.println("NO");
    }
}
