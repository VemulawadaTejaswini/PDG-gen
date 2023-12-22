import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        StringBuilder sb = new StringBuilder(sc.next());
        int q = Integer.parseInt(sc.next());
        boolean reverse = false;
        for(int i = 0; i < q; i++){
            if(Integer.parseInt(sc.next()) == 1){
                reverse = !reverse;
            }else{
                int f = Integer.parseInt(sc.next());
                String c = sc.next();
                if((!reverse && f == 1) || (reverse && f == 2)){
                    sb.insert(0, c);
                }else{
                    sb.append(c);
                }
            }
        }
        if(reverse){
            System.out.println(sb.reverse());
        }else{
            System.out.println(sb);
        }
    }
}