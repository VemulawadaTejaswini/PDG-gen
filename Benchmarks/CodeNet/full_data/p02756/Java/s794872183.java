import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int q = scanner.nextInt();
        for(int i = 0; i < q; i++){
            int t = scanner.nextInt();
            if(t == 1){
                s = new StringBuilder(s).reverse().toString();
            }else{
                int t1 = scanner.nextInt();
                char t2 = scanner.next().charAt(0); 
                if(t1 == 1){s = t2 + s;}
                else{s = s + t2;}
            }
        }
        System.out.println(s);
    }
}

