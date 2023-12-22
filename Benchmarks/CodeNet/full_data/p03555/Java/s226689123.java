import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        String result="YES";
        char[] in =str1.toCharArray();
        char[] out=str2.toCharArray();
        for(int i=0;3>i;i++){
            if(in[i]!=out[2-i]){
                result ="NO";
            }
        }
        System.out.println(result);
    }
}
