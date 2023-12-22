import java.util.Scanner;

public class Main {
    public static int binary(int dec){
        final String bin = Integer.toBinaryString(dec);
        return Integer.parseInt(bin);
    }
    
    public static int decimal(int bin){
        final int dec = Integer.parseInt(bin, 2);
        return Integer.parseInt(dec);
    }
    
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        
        int n = stdIn.nextInt();
        //int b = stdIn.nextInt();
        //int c = stdIn.nextInt();
        //int x = stdIn.nextInt();
        int num[] = new int[n];
        //String s = stdIn.next();
        //String t = stdIn.next();
        //char c[] = s.toCharArray();
        int count = 0;
        //int sum = 0;
        //boolean flag = true;
        for(int i = 0; i < s.length() / 2; i++){
            if(c[i] != c[s.length() - i - 1]){
                count++;
            }
        }
        
        System.out.println(count);
        
        //System.out.println();
        //System.out.print();

        stdIn.close();
    }
}
