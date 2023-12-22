import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.next();
        String[] a = new String[16];
        int result = 0;
        a[0] = "C";
        a[1] = "O";
        a[2] = "D";
        a[3] = "E";
        a[4] = "F";
        a[5] = "E";
        a[6] = "S";
        a[7] = "T";
        a[8] = "I";
        a[9] = "V";
        a[10] = "A";
        a[11] = "L";
        a[12] = "2";
        a[13] = "0";
        a[14] = "1";
        a[15] = "6";
        for (int i = 0; i < 16;i++ ){
            if(str.substring(i-1,i).equals(a[i])){
                result ++;
            }
        }
        System.out.println(16-result);
    }
    
}
