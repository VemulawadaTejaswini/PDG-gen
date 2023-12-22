import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            String S = sc.next();
            String Sarray[] = S.split("");
            String afromZ = "abcdefghijklnmopqrstuvwxyz";
            String afromZ_Array[] = afromZ.split("");
            Arrays.sort(Sarray);
            for (String string : afromZ_Array) {
                System.out.println(string);
                
            }
            int iti = 0;
            int count = 0;
            for(int abc = 0;abc < afromZ_Array.length;abc++){
                for(int i = 0;i < Sarray.length;i++){
                    //System.out.println(afromZ_Array[abc] + " " + Sarray[i]);
                    if(afromZ_Array[abc].equals(Sarray[i])){
                        iti += 1;
                        if(iti == 2){
                            System.out.println("no");
                            System.exit(1);
                        }
                    }
                    iti = 0;
                }
            }
            System.out.println("yes");

    }
}