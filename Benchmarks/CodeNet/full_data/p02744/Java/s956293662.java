import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char[] str = new char[n];
        process(str, (1<<n)-1, 'a');
    }

    private static void process(char[] str, int mask, char c){
        if(mask==0){
            String x = new String(str);
            System.out.println(x);
        }else{
            int maxBit = Integer.highestOneBit(mask);
            for (int submask=mask; submask>=maxBit; submask=(submask-1)&mask){
                for (int i=str.length-1, bit = 1; bit <= maxBit; bit<<=1, i--) {
                    if((submask & bit)!=0){
                        str[i]=c;
                    }
                }
                process(str, submask ^ mask, (char)(c+1));
            }
        }
    }
}