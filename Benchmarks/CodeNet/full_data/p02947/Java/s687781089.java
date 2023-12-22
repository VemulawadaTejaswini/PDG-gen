import java.util.*;
public class Main {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                char[][] a = new char[n][10];
                for(int i = 0 ; i < n ; i++){
                        String s = sc.next();
                        for(int ii = 0 ; ii < 10 ; ii++){
                                a[i][ii] = s.charAt(ii);
                        }
                        Arrays.sort(a[i]);
                }
                sc.close();
                long yono = 0;
                for(int i = 0 ; i < n ; i++){
                        for(int j = 0 ; j < i ; j++){
                                boolean ebishu = true;
                                for(int k = 0 ; k < 10 && ebishu ; k++){
                                        if(a[i][k] != a[j][k]) ebishu = false;
                                }
                                if(ebishu) yono++;
                        }
                }
                System.out.println(yono);
        }
}