import java.util.Scanner;
class ABC105A{
    public static void main(String arg[]){
        Scanner scn=new Scanner(System.in);
        int rate = scn.nextInt();
        if(rate<1200){
            System.out.println("ABC");
        }else if(2800<=rate){
            System.out.println("AGC");
        }else{
            System.out.println("ARC");
        }
    }
}