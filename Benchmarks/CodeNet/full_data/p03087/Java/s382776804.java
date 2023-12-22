import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int nbQuestion = sc.nextInt();
        String originalString = sc.next();

        List<Pair<Integer, Integer>> set = new ArrayList<>();

        for (int j=0; j<originalString.length()-1; j++) {
            String subString = originalString.substring(j, j+2);
            if (subString.equals("AC")) {
                Pair<Integer, Integer> indexPair = new Pair<>(j, j+1);
                set.add(indexPair);
            }
        }

        for (int i=0; i<nbQuestion; i++) {
            int sum = 0;
            int start = sc.nextInt();
            int end = sc.nextInt();

            for (int k=start-1; k<=end-2; k++) {
                Pair<Integer, Integer> newPair = new Pair<>(k, k+1);
                if (set.contains(newPair)) {
                    sum+=1;
                }
            }
            System.out.println(sum);
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
