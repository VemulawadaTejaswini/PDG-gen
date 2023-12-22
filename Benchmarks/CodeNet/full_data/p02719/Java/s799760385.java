import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);

        long x=stdIn.nextLong();
        long y=stdIn.nextLong();

        while(x>=0){
            x-=y;
        }
        if(-x==y){
            System.out.println(0);
            
        }
        else if(-x>=x+y){
            x+=y;
            System.out.println(x);
            
        }
        else{
            System.out.println(x);
            
        }
        
    }

}