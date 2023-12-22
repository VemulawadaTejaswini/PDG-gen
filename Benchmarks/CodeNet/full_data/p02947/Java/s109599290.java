import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String[] ch = new String[a];
   
        for(int i = 0; i < a; i++){
            String s = sc.next();
            char[] c = s.toCharArray();
            Arrays.sort(c);
            s = new String(c);
            ch[i] = s;
        }
        int count = 0;
        for(int i = 0; i < a; i++){
            for(int j = i + 1; j < a; j++){
                if(ch[i].equals(ch[j])){
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}