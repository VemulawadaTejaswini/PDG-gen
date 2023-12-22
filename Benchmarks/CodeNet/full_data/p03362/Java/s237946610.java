import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        System.out.println("Yes");
        sb.append(2);
        sb.append(" ");
        sb.append(7);
        sb.append(" ");
        int count=2;
        int cur = 17;
        while(count<N){
            if(cur%3!=0&&cur%7!=0){
                sb.append(cur);
                sb.append(" ");
                count++;
            }
            cur += 10;
        }
        while(cur%3==0||cur%7==0){
            cur += 10;
        }
        sb.append(cur);
        System.out.print(sb.toString());
    }
}