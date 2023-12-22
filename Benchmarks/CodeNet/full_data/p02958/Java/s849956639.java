import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] p = new int[n];
        for(int i = 0;i<n;i++){
            p[i] = Integer.parseInt(sc.next());
        }
        int[] p2 = p.clone();
        Arrays.sort(p2);
        int tmp = 0;
        boolean flag = true;
        for(int i = 0;i<n;i++){
            if(p[i] != p2[i]){
                if(tmp == 0){
                    tmp = p[i];
                }else{
                    if(tmp != p2[i]){
                        flag = false;
                    }
                }
            }
        }
        if(flag == true){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}