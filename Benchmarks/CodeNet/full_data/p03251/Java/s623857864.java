import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kna = sc.nextInt();
        int knb = sc.nextInt();
        int cca = sc.nextInt();
        int ccb = sc.nextInt();
        
        for(int i = 0;i < kna;i++)
            cca = Math.max(cca,sc.nextInt());
        for(int i = 0;i < knb;i++)
            ccb = Math.min(ccb,sc.nextInt());

        System.out.println(cca < ccb?"No War":"War");
        

        
    }
}