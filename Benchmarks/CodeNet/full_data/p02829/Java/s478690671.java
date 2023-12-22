import java.util.*;

class Main{

    Main(){
        Scanner SC = new Scanner(System.in);
        boolean[] P = new boolean[3];
        P[SC.nextInt()-1] = true;
        P[SC.nextInt()-1] = true;

        for(int i=0;i<3;i++){
            if(P[i])continue;
            System.out.println(i+1);
        }
    }

    public static void main(String[] args){
        Main main = new Main();
    }
}
