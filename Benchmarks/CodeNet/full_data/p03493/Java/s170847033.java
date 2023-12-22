import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int m = 0;
        char[] c = n.toCharArray();
        for(int i = 0; i < 3; i++){
            if(c[i] == '1'){
                m++;
            }
        }
        System.out.println(m);
    }
}