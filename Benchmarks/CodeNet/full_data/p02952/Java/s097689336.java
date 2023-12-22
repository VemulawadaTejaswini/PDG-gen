import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

      	int sc = s.nextInt();
       int oneFilter = 10;
        int twoFilter = 100;
        int threeFilter = 1000;
        int fourFilter = 10000;
        int fiveFilter = 100000;
        if (sc < oneFilter) {
            System.out.println(sc);
        } else if (sc < twoFilter) {
            System.out.println(9); 
        } else if (sc < threeFilter) {
            System.out.println(sc-twoFilter+9);
        } else if (sc < fourFilter) {
            System.out.println(sc-threeFilter+909);            
        } else if(sc < fiveFilter) {
            System.out.println(sc-fourFilter+909);
        } else {
            System.out.println(90909);         
        }

    }
}