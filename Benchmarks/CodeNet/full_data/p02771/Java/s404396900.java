import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Set<Integer> set = new HashSet<>(){
            {
                add(a);
                add(b);
                add(c);
            }
        };
        if(set.size()==2){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }

}
