import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int q = sc.nextInt();
        StringBuilder sub;
        for(int i = 0;i < q;i++){
            if(sc.nextInt() == 1){
                sub = new StringBuilder(s);
                s = sub.reverse().toString();
            }else{
                sub = new StringBuilder();
                if(sc.nextInt() == 1){
                    sub.append(sc.next());
                    sub.append(s);
                }else{
                    sub.append(s);
                    sub.append(sc.next());
                }
                s = sub.toString();
            }
        }
        System.out.println(s);
    }
}
