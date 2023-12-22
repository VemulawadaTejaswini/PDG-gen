import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        String ans = "NO";
        int[] res = new int[]{A,B,C};
        Arrays.sort(res);
        if(res[0]==5&&res[1]==5&&res[2]==7) ans = "YES";
        System.out.println(ans);
    }
}
