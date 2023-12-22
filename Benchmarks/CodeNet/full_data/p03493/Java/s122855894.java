import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc1 = new Scanner(System.in);
        
        int [] s = new int[3];
        int count = 0;
        s[0] = sc1.nextInt();if(s[0]==1)count++;
        s[1] = sc1.nextInt();if(s[1]==1)count++;
        s[2] = sc1.nextInt();if(s[2]==1)count++;

        System.out.println(count);
    }
}