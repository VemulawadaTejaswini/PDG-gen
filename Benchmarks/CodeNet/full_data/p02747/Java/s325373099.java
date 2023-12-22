import java.util.*;

class Main {

    Main(){
        Scanner SC = new Scanner(System.in);
        String S = SC.next();

        String HI = "hi";
        while(S.length() >= HI.length()){
            if(S.equals(HI)){
                System.out.println("Yes");
                return;
            }
            HI = HI + "hi";
        }

        System.out.println("No");
    }

    public static void main(String[] args){
        Main main = new Main();
    }
}
