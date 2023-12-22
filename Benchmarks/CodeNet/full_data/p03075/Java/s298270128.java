import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        for (int i=0; i<5; i++) {
            int input = sc.nextInt();
            list.add(input);
        }

        Collections.sort(list);

        int diff = list.get(4) - list.get(0);
        int k = sc.nextInt();

        if (diff <= k) {
            System.out.println("Yay!");
        } else {
            System.out.println(":(");
        }
    }
}

class Pair<T1,T2> {
    private T1 left;
    private T2 right;

    public Pair(T1 left, T2 right) {
        this.left = left;
        this.right = right;
    }

    public T1 getLeft() {
        return this.left;
    }

    public T2 getRight() {
        return this.right;
    }

    @Override
    public boolean equals(Object object) {
        Pair pair = (Pair)object;
        if (pair.getLeft().equals(this.getLeft())
                && pair.getRight().equals(this.getRight())) {
            return true;
        }
        return false;
    }
}
