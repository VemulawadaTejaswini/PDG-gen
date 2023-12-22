import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> all = new HashSet<>();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        all.add(a);
        all.add(b);
        all.add(c);
        if(all.size()==2){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");

        }
    }
}
