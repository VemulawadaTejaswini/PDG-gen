import java.util.Scanner;
    public class Main{
        public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            long num=in.nextLong();
            long tk=0;
            long pchso=num/500;
            tk=pchso*1000;
            int baki=(int) (num%500);
            long pach=baki/5;
            tk=tk+(pach*5);
            System.out.println(tk);
        }
    }