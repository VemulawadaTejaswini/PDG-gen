import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        String odd = "RUD";
        String even = "LUD";
        for(int i=1;i<=s.length;i++){
            if(i%2!=0 && odd.indexOf(s[i-1])==-1){
                System.out.println("No");
                return;
            }else if(i%2==0 && even.indexOf(s[i-1])==-1){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
    
}