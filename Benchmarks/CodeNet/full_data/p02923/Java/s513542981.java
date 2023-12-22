import java.util.*;


public class Main {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        int N = Integer.valueOf(sc.nextLine());
        String[] HN = sc.nextLine().split(" ");

        int[] hantei = new int[N];
        
        int count = 0;
        for (int i = 0; i < N-1; i++) {
            int Hi = Integer.valueOf(HN[i]);
            int Hj = Integer.valueOf(HN[i+1]);
            
            if (Hi >= Hj) {
                count++;
            } else {
                count = 0;
            }
            hantei[i] = count;
                
        }
        
        int max = hantei[0];
        int min = hantei[1];
        for (int i = 1; i < hantei.length; i++) {
            int v = hantei[i];
            if (v > max) {
                max = v;
            }
            if (v < min) {
                min = v;
            }
            
        }
        System.out.println(max);
    }
}