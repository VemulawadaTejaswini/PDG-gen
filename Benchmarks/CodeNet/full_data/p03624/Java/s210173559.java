import java.util.*;
import java.util.Collections;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        int l = S.length();
        int x = 0;
        ArrayList<Character> list = new ArrayList<Character>();

        for(int i=0; i<l; i++){
            list.add(S.charAt(i));
        }

        Collections.sort(list);

        for(int i=0; i<l-1; i++){
            if(list.get(i)+1!=list.get(i+1) && list.get(i)!=list.get(i+1)){
                System.out.println((char)(list.get(i) + 1));
                break;
            }
            if(i==l-2){
                if(list.get(l-1)=="z".charAt(0)){
                    System.out.println("None");
                }
                else{
                    System.out.println((char)(list.get(l-1) + 1));
                }
            }
        }
    }
}