import java.util.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int a = 0;
                int fia = 0;
                for(int i = 0 ; i < n ; i++){
                        a = sc.nextInt();
                        if(a % 2 == 1) fia++;
                }
                if(fia % 2 == 0){
                        System.out.println("YES");

                }else{
                        System.out.println("NO");
                }
        }
}