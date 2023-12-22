import java.io.*;
import java.util.*;
class Program{
    char[] change(char c[]){
        char temp = '\0', chng = c[c.length-1];
        for(int i = 0;i<c.length;i++){
            temp = c[i];
            c[i] = chng;
            chng = temp;
        }
        return c;
    }
}
class Main{
    public static void main(String args[])throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Program obj = new Program();
        String S = in.readLine(), T = in.readLine();
        char s []= S.toCharArray(), t[] = T.toCharArray();
        boolean flag = false;
        for(int i=0;i<s.length;i++){
            //System.out.println(Arrays.toString(obj.change(s)));
            if (Arrays.toString(obj.change(s)).equals(Arrays.toString(t))){
                flag = true;
                break;
            }
        }
        if (flag) System.out.println("Yes");
        else System.out.println("No");
    }
}