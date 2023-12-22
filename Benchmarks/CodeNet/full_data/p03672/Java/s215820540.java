import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len =str.length();
        sc.close();
        for(int i=1;i<=len;i++){
            int center = (len-i)/2;
            if(str.substring(0, center).equals(str.substring(center,len-i))){
                System.out.println(len-i);   
                break;
            }
        }
    }
}