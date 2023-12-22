import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String str[] =S.split(""); 
        int sum = 0;
        for(int i=0;i<str.length/2;i++)
        {
            if(!(str[i].equals(str[str.length-i-1])))
            {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
