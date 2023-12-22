import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long h = scan.nextLong();
        long w = scan.nextLong();
        if(h == 1 && w == 1){
            System.out.println(1);
        }else
        {
            System.out.println(((h*w)+1)/2);    
        }
        
    }
}