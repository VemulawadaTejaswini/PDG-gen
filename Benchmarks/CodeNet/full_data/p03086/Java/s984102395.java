import java.util.*;

public class Main {



    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        char[] carray = str.toCharArray();

        int count = 0;
        int max = 0;
        for(int i = 0; i<carray.length; i++){

            if(carray[i] == 'A' || carray[i] == 'T' || carray[i] == 'G' || carray[i] == 'C'){
                count++;
            }else{
                if(max <= count) max = count;
                count = 0;
            }
        }

        max = count;

        System.out.println(max);
    }
}