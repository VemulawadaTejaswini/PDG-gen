import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        String[] str= new String [N];
        sc.nextLine();
        for(int i = 0;i < N;i++){
            str[i] = sc.nextLine();
        }
        String reg;
        for(int i = 0;i < N;i++){
            for(int j = i;j < N;j++){
                if(str[i].charAt(0) > str[j].charAt(0)){
                    reg = str[i];
                    str[i] = str[j];
                    str[j] = reg;
                }
                if(str[i].charAt(0) == str[j].charAt(0)){
                }
            }
        }
        for(int i = 0;i < N;i++){
            System.out.print(str[i]);
        }
        System.out.println();
    }
}
