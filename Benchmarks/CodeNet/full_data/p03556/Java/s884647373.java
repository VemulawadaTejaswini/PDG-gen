import java.util.*;

class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int intInput = sc.nextInt();

        int count = 1;
        while (multi(count-1,2) < intInput){
            count ++;
        }
        count --;

        System.out.println(count);
    }


    public static int multi(int x, int y){
        if( y != 0 ){
            y --;
            return multi(x,y) * x;
        }else{
            return 1;
        }
    }
}
