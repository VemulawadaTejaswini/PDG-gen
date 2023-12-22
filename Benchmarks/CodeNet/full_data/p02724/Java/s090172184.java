import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);

        int x=stdIn.nextInt();
        int a=x/500; //500円の枚数
        int b=x%500; //500円に換算した後の余り
        int c=b/5;
        
        System.out.println(a*1000+c*5);
        
    }

}