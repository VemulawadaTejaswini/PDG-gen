import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();

        char[] chars = n.toCharArray();

        boolean flg = false;
        for(int i=0;i<chars.length;i++){
            if(i%2==0){
                char temp = chars[i];
                if(temp == 'L'){
                    System.out.println("No");
                    return;
                }
            }else{
                char temp = chars[i];
                if(temp == 'R'){
                    System.out.println("No");
                    return ;
                }

            }
        }
        System.out.println("Yes");


    }
}