import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        List<Integer> kuku = new ArrayList<>();
        for(int i = 1;i<=9;i++){
            for(int j = 1;j<=9;j++){
                kuku.add(i*j);
            }
        }
        if(kuku.contains(n)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }        
    }
}