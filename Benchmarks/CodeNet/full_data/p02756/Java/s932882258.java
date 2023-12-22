import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int q = scanner.nextInt();
        boolean reverse = false;
        for(int i = 0; i < q; i++){
            int t = scanner.nextInt();
            if(t == 1){
                reverse = !reverse;
            }else{
                int t1 = scanner.nextInt();
                char t2 = scanner.next().charAt(0); 
                if(t1 == 1 && !reverse || t1 == 2 && reverse){s = t2 + s;}
                else{s = s + t2;}
            }
        }
        if(reverse){s = new StringBuilder(s).reverse().toString();}
        System.out.println(s);
    }
}

