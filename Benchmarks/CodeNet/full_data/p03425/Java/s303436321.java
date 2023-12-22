import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] march = new int[5];
        
        String l;
        int i;
        while(n-- > 0){
            l = sc.nextLine();
            i = getInd(l.charAt(0));
            if(i != -1)
                march[i]++;
        }
        
        int res = 1;
        for(i = 1; i < 5; i++){
            if(march[i] > 0)
                res = res*march[i];
        }
        System.out.println(res);
    }
    private static int getInd(char c){
        if(c == 'M')
            return 0;
        else if(c == 'A')
            return 1;
        else if(c == 'R')
            return 2;
        else if(c == 'C')
            return 3;
        else if(c == 'H')
            return 4;
        return -1;
    }
}