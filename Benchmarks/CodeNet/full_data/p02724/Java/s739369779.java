import java.util.*;

class Main{
    Main(){
        Scanner SC = new Scanner(System.in);

        int X = Integer.parseInt(SC.next());

        int R = (X / 500) * 1000;
        R += (X % 500) / 5 * 5;

        System.out.println(R);
    }

    public static void main(String[] args){
        Main main = new Main();
    }
}
