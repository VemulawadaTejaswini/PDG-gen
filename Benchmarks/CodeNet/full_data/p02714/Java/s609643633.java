import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String kuuhaku = sc.nextLine();
        String line= sc.nextLine();
        String r = "R";
        String g = "G";
        String b = "B";
        String[] s = line.split("");
        int sum = 0;
        
        for(int i = 0; i < N; i++) {
            for(int j = i+1; j < N; j++) {
                if(s[i].equals(s[j])) {
                    continue;
                }
                for(int k = j+1; k < N; k++) {
                    if(s[i].equals(s[k])) {
                        continue;
                    }else if(s[k].equals(s[j])) {
                        continue;
                    }else if(j-i == k-j) {
                        continue;
                    }else {
                        sum++;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}