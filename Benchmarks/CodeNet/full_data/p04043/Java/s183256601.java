import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] ABC = new String [3];
        for(int i=0; i<3; i++){
            ABC[i] = sc.next();
        }
        Arrays.sort(ABC);
        String S = "";
        for(int i=0; i<3; i++){
            S=S+ABC[i];
        }
        if("557".equals(S)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}