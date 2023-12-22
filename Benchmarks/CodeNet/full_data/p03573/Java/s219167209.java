import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        int c=scn.nextInt();
        if(a-b==0){
            System.out.println(c);
        }else if(a-c==0){
            System.out.println(b);
        }else{
            System.out.println(a);
        }
    }
}