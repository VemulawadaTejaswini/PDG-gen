import java.util.Scanner;

class A{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int x = stdIn.nextInt();
        int y = stdIn.nextInt();
        if (x*500 >=y){
            System.out.println("YES");     
        }else{
            System.out.println("NO");  
         }    
    }
}