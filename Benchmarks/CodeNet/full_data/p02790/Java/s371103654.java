import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt(),b=scan.nextInt();
        String stra = (String.valueOf(a));
        String strb = (String.valueOf(b));
        if(b>=a){
            System.out.println(stra.repeat(b));
        }
        else{
            System.out.println(strb.repeat(a));
        }
    }
}
