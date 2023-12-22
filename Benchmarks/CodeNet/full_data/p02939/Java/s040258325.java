import java.util.*;


public class Main {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

      	String sc = s.next();
        String[] strArray = new String[sc.length()];
        String[] judgeArray = new String[sc.length()];
      
        for (int i = 0; i < sc.length(); i++) {
            strArray[i] = String.valueOf(sc.charAt(i));
        }
        int flg = 0;
        for (int i = 0; i < strArray.length; i++) {
            if(i == 0 || (i != strArray.length-1 && strArray[i] != strArray[i+1])) {
                flg++;
            }
        }
        System.out.println(flg);
    }
}