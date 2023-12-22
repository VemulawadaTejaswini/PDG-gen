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
        for(int i = 0;i < N;i++){
            for(int j = i + 1;j < N;j++){
                int so = 0;
                while(str[i].charAt(so) == str[j].charAt(so)){
                    so++;
                    if(so == L-1){
                        break;
                    }
                }
                if(str[i].charAt(so) > str[j].charAt(so)){
                    String reg = str[i];
                    str[i] = str[j];
                    str[j] = reg;
                }
            }
        }
        for(int i = 0;i < N;i++){
            System.out.print(str[i]);
        }
        System.out.println();
    }
}