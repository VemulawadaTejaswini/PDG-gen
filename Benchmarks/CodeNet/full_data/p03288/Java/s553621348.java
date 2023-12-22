import java.util.Scanner;
class Main{
    public static void main(String arg[]){
        Scanner scn=new Scanner(System.in);
        int rate = scn.nextInt();
        if(r<1200){
            System.out.println("ABC");
        }else if(2800<=r){
            System.out.println("AGC");
        }else{
            System.out.println("ARC");
        }
    }
}