import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] w = new int[4];
        for(int i=0;i<4;i++){
            w[i] = sc.nextInt();
        }
        String ans;
        if(w[0]+w[1]>w[2]+w[3]) ans = "Left";
        else if(w[0]+w[1]==w[2]+w[3]) ans = "Balanced";
        else ans = "Right";
        System.out.println(ans);
    }
}