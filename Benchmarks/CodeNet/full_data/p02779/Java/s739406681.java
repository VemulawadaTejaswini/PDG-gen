import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] data = (sc.nextLine()).split(" ");
        boolean ans = false;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i!=j && data[i].equals(data[j])){
                    ans = true;
                }
                    
            }
        }
        if(ans){
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
