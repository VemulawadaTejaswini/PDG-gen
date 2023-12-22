import java.util.*;
import java.math.*;
public class Main{
        public static void main(String args[])
        {

            Scanner sc = new Scanner(System.in);
            int k = sc.nextInt();
            String s = sc.next();

            char c [] =new char[s.length()];
            for(int i=0; i<s.length();i++){
              int temp = (int)s.charAt(i);
              if(s.charAt(i)+k<=90)
                c[i] = (char)(temp+k);
                else
                c[i] =(char)(temp+(k-26));
            }
            for(char cc : c)
            System.out.print(cc);


        }
}
