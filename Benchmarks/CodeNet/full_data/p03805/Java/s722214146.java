import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static int through[];
    static int answer = 0;

    static void plusAnswer(){
        answer++;
    }

    static boolean checkToBeAbleToGo(int num){
        return through[num] == 0;
    }

    static void markPoint(boolean isThrough, int num){
        if(isThrough)
            through[num] = 1;
        else
            through[num] = 0;
    }

    static boolean isAllThroughed() {
        for(int i = 0; i < through.length; i++) {
            if(through[i] == 0)
                return false;
        }
        return true;
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        answer = 0;
        Scanner scan = new Scanner(is);
        int N = scan.nextInt();
        int M = scan.nextInt();
        through = new int[N];
        Arrays.fill(through, 0);
        Tree tree[] = new Tree[N];
        for(int i = 0; i < N; i++) {
            tree[i] = new Tree();
            tree[i].children = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            int a = scan.nextInt() - 1;
            int b = scan.nextInt() - 1;
            tree[a].children.add(tree[b]);
            tree[a].number = a;
            tree[b].children.add(tree[a]);
            tree[b].number = b;
        }

        tree[0].checkGoNext();

        os.println(answer);
    }

}

class Tree {
    public void Tree(){}
    int number;
    List<Tree> children;

    public void checkGoNext() {
        boolean isWentNext = false;
        Main.markPoint(true, number);
        for (Tree child : children){
            if(Main.checkToBeAbleToGo(child.number)) {
                isWentNext = true;
                child.checkGoNext();
            }
        }
        if(!isWentNext) {
            if(Main.isAllThroughed())
                Main.plusAnswer();
        }
        Main.markPoint(false, number);
    }
}