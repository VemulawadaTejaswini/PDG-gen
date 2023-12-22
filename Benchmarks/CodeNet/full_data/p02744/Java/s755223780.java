import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        for(int i = n;i > 0;i--){
            int offset = n-i;
            String base = "";
            for(int j = 0;j <= offset;j++){
                base += String.valueOf((char)('a' + j));
            }

            StringBuilder sb1 = new StringBuilder();
            for(int k = i-2;0 <= k;k--){
                sb1.append((char)('a' + offset));
            }
            System.out.println(base + sb1.toString());

            for(int j = 1;j <= Math.pow(2, i-1) - 2;j++){
                StringBuilder sb2 = new StringBuilder();
                for(int k = i-1;0 < k;k--){
                    if(((int)Math.pow(2,k-1) & j) != 0){
                        sb2.append((char)('a' + offset + 1));
                    } else {
                        sb2.append((char)('a' + offset));
                    }
                }
                System.out.println(base + sb2.toString());
            }
        }
    }
}