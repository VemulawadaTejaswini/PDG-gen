import java.util.*;
import java.lang.*;

import static java.lang.StrictMath.abs;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] a = new String[s.length()];
        List<String> b = new ArrayList<String>();
        List<String> c = new ArrayList<String>();

        int count =0;
        for(int i =0; i< s.length();i++ ){
            for(int k=i; k<= i+5; k++){
                try {
                    b.add(s.substring(i, k));
                }catch (StringIndexOutOfBoundsException e){

                }

                count++;
            }
        }
        Collections.sort(b);
        c.add(b.get(0));

        for(int j =0; j < b.size()-1; j++){

            if(b.get(j).equals(b.get(j+1))){
                continue;
            }else{
                c.add(b.get(j+1));
            }
        }
        System.out.println(c.get(sc.nextInt()));



    }

}