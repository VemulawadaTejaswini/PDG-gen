import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);

        int x=stdIn.nextInt();
        int y=stdIn.nextInt();

        while(x>0){
            x-=y;
        }
        
        if(x+y>=Math.abs(x)){
            x+=y;
        }
        if(Math.abs(x)==y){
            x=0;
        }
        System.out.println(x);
        
    }

}