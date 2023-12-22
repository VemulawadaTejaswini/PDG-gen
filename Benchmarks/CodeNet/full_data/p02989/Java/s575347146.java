import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        int[] dificulties = new int[num];
        for(int i = 0; i < num; i++){
            dificulties[i] =  sc.nextInt();
        }
        Arrays.sort(dificulties);
        int halfNum = num / 2;
        int ans = dificulties[halfNum] - dificulties[halfNum-1];

        System.out.println(ans);
    }
}