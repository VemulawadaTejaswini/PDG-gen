import java.util.Scanner;
class Main{
    public static void main(String[]$){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt(),b=s.nextInt();
        System.out.println((((a%3)*(b%3)*((a+b)%3)==0)?"P":"Imp")+"ossible");
    }
}
