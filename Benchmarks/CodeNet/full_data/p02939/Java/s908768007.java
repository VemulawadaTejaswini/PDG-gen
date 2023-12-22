import java.util.*;

public class Main{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int count = 1;

        String s = str.substring(0,1);

        int i =1;
        while(i<str.length()){
            int j = i+1;
            if ((i==str.length()-1) && s.equals(str.substring(i, j))) break;
            while(s.equals(str.substring(i, j))){
                j++;
            }
            s = str.substring(i, j);
            i = j;
            count++;
        }

        System.out.println(count);

    }
}