import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] input = new String[N];
        int i = 0;
        for(String s: sc.next().split("")){
            input[i] = s;
            i++;
        }
        int min_count = 3000001;
        for(int j = 0; j < N; j++){
            String[] subL;
            String[] subR;
            int count = 0;
            if(j == 0){
                subR = input;
                for(String str: subR){
                    if(str.equals("E")){
                        count++;
                    }
                }
            }else if(j == N - 1){
                subL = input;
                for(String str: subL){
                    if(str.equals("W")){
                        count++;
                    }
                }
            }else{
                subL = Arrays.copyOfRange(input, 0, j);
                subR = Arrays.copyOfRange(input, j + 1, N);
                for(String str: subR){
                    if(str.equals("E")){
                        count++;
                    }
                }
                for(String str: subL){
                    if(str.equals("W")){
                        count++;
                    }
                }
            }
            min_count = Math.min(count, min_count);
        }
        System.out.println(min_count);
    }
}
