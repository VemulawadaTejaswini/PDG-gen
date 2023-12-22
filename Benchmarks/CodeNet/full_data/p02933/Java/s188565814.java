import java.util.Scanner;
class RedOrNot {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        String sS = scan.next();
        int hoge = sS.length();

        if(2800 <= a || a < 5000){
            if(1 <= hoge || hoge <= 10){
                if( 3200 <= a){
                    System.out.println(sS);
                }else{
                    System.out.println("red");
                }
            }
        }
    }
}