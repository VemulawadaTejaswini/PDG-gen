import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = n%10;
        int c = n/10%10;
        int b = n/100%10;
        int a = n/1000;

        String s = new String();
        if(a+b+c+d==7){
            s = a+"+"+b+"+"+c+"+"+d;
        }else if(a-b+c+d==7){
            s = a+"-"+b+"+"+c+"+"+d;
        }else if(a+b-c+d==7){
            s = a+"+"+b+"-"+c+"+"+d;
        }else if(a+b+c-d==7){
            s = a+"+"+b+"+"+c+"-"+d;
        }else if(a-b-c+d==7){
            s = a+"-"+b+"-"+c+"+"+d;
        }else if(a+b-c-d==7){
            s = a+"+"+b+"-"+c+"-"+d;
        }else if(a-b-c-d==7){
            s = a+"-"+b+"-"+c+"-"+d;
        }else{
            s = "error";
        }

        System.out.println(s+"=7");
    }
}