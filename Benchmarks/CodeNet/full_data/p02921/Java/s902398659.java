import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String s,t;
        int con;
        s=scan.next();
        t=scan.next();
        con=0;
        for(int i=0;i<3;i++){
            if(s.charAt(i)==t.charAt(i)) con+=1;
        }
        System.out.println(con);
    }
}