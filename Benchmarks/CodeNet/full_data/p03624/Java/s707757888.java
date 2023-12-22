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
            else if(list.get(i)==list.get(i+1)){
                x += 1;
            }
            if(i==l-2){
                if(x==l-1){
                    System.out.println((char)(list.get(i)+1));
                    break;
                }
                System.out.println("None");
            }
        }
    }
}