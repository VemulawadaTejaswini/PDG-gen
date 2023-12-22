import java.lang.reflect.Array;
import java.util.*;
public class Main {




    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;
        String inputStr = scan.next();
        String destStr = scan.next();

        char[] inputChar     = inputStr.toCharArray();
        char[] destChar = destStr.toCharArray();

        int i_input = 0;
        int i_dest = 0;

        int i_searched_input = 0;
        int i_searched_dest  = 0;

        for(int i =0; i < destStr.length(); i++){

            i_input = i;
            i_dest  = i;

            i_searched_input = inputStr.indexOf(destChar[i_dest]);
            i_searched_dest  = i_searched_input;


            if(i_searched_dest == -1) {



            } else if(i_searched_dest == 0){

                if( destChar[i_searched_dest + 1] == inputChar[i_input]
                        || destChar[i_searched_dest] == inputChar[i_input]) {

                }else{

                    System.out.println("No");
                    return;
                }

            }else if(i_searched_dest == destStr.length() -1){

                if( destChar[i_searched_dest-1] == inputChar[i_input]
                        || destChar[i_searched_dest] == inputChar[i_input]) {

                }else{

                    System.out.println("No");
                    return;
                }

            }else{

                if( destChar[i_searched_dest-1] == inputChar[i_input]
                        || destChar[i_searched_dest] == inputChar[i_input]
                            || destChar[i_searched_dest+1] == inputChar[i_input]) {

                }else{

                    System.out.println("No");
                    return;
                }
            }
        }

        System.out.println("Yes");
        return;
    }
}
