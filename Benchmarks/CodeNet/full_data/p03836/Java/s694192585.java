import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sx = sc.nextInt();
        int sy = sc.nextInt();
        int tx = sc.nextInt();
        int ty = sc.nextInt();
        StringBuilder res = new StringBuilder("");
        for(int i = 0; i < ty - sy; i++)
            res.append('U');
        for(int i = 0; i < tx - sx; i++)
            res.append('R');
        for(int i = 0; i < ty - sy; i++)
            res.append('D');
        for(int i = 0; i < tx - sx; i++)
            res.append('L');
        res.append('D');
        for(int i = 0; i < tx - sx + 1; i++)
            res.append('R');
        for(int i = 0; i < ty - sy + 1; i++)
            res.append('U');
        res.append('L');
        res.append('U');
        for(int i = 0; i < tx - sx + 1; i++)
            res.append('L');
        for(int i = 0; i < ty - sy + 1; i++)
            res.append('D');
        res.append('R');
        System.out.println(res.toString());
        
    }
}
