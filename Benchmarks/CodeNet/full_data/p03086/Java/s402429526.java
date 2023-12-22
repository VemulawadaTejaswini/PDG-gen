import java.util.*;

public class Main {



    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        int length = str.length();

        if(str.length() ==1){

            if(str.equals("A") || str.equals("C") || str.equals("G") || str.equals("T")){

                System.out.println(1);
                return;

            }else{

                System.out.println(0);
                return;

            }

        }

        char[] carray = str.toCharArray();

        int count1 = 0;
        boolean isConcat1 = false;
        int max1 = 0;
        for(int i = length/2 -1; 0<=i; i--){

            if(carray[i] == 'A' || carray[i] == 'T' || carray[i] == 'G' || carray[i] == 'C'){
                count1++;
                if(i == length/2 -1 ) isConcat1 = true;

            }else{
                if(max1 <= count1) max1 = count1;
                count1 = 0;
            }
        }

        max1 = count1;

        int count2 = 0;
        boolean isConcat2 = false;
        int max2 = 0;
        for(int i = length/2; i<= length -1; i++){

            if(carray[i] == 'A' || carray[i] == 'T' || carray[i] == 'G' || carray[i] == 'C'){
                count2++;
                if(i == length/2) isConcat2 = true;

            }else{
                if(max2 <= count2) max2 = count2;
                count2 =0;
            }
        }

        max2 = count2;


        if(isConcat1 && isConcat2){
            System.out.println(max1+max2);
            return;
        }


        System.out.println(max1 > max2 ? max1:max2);
    }
}
