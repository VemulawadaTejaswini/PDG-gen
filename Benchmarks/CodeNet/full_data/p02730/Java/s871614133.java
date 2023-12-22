import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s=in.nextLine();//.toString();
        int len = s.length();
        for(int i=0,j=len/2-1;i<j;i++,j--){
            if(s.charAt(i)!=s.charAt(j)){
                System.out.println("No");
                return;
            }
        }
        for(int i=len/2+1,j=len-1;i<j;i++,j--){
            if(s.charAt(i)!=s.charAt(j)){
                System.out.println("No");
                return;
            }
        }
        for(int i=0,j=len-1;i<j;i++,j--){
            if(s.charAt(i)!=s.charAt(j)){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");

    }
}
