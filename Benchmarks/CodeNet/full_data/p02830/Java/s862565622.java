import java.util.*;

class Main{

    Main(){
        Scanner SC = new Scanner(System.in);
        int N = Integer.parseInt(SC.next());
        String S = SC.next();
        String T = SC.next();

        for(int i=0;i<N;i++){
            System.out.print(S.charAt(i));
            System.out.print(T.charAt(i));
        }

        System.out.println("");
    }

    public static void main(String[] args){
        Main main = new Main();
    }
}
