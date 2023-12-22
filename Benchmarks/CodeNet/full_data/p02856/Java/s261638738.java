import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int m = stdIn.nextInt();
        long[] d = new long[m];
        long[] c = new long[m];
        for(int i=0; i<m; i++){
            d[i] = stdIn.nextLong();
            c[i] = stdIn.nextLong();
        }

        long temp = 0;
        long counter = -1;
        for(int i=0; i<m; i++){
            for(int j=0; j<c[i]; j++){
                temp += d[i];
                counter++;
                while(temp >= 10){
                    temp = temp / 10 + temp % 10;
                    counter++;
                }
            }
        }

        System.out.println(counter);
    }
}