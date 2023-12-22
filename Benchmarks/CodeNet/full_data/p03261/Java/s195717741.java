import java.io.BufferedInputStream;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedInputStream(System.in));
        int N = scan.nextInt();
        String[] words = new String[N];
        for (int i=0;i<N;i++) words[i] = scan.next();
        Task tsk = new Task();
        System.out.println(tsk.solve(words)?"Yes":"No");
    }

    static class Task{
        public boolean solve(String[] words){
            HashSet<String> visited = new HashSet<>();
            for (int i=0;i<words.length;i++) {
                if (!visited.add(words[i])) return false;
                if (i > 0 && words[i].charAt(0) != words[i-1].charAt(words[i-1].length()-1)) return false;
            }
            return true;
        }
    }
}
