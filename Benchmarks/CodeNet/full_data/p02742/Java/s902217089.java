import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        int c=0;
        int an=0;
        Scanner scan = new Scanner(System.in);
        a= scan.nextInt();
        b= scan.nextInt();
        if(a%2==0){
            an=(a*b)/2;
        }
        if(a%2==1){
            an=a*b/2+1;
        }
        System.out.println(an);
    }
}