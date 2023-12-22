import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int K = Integer.parseInt(sc.next());
        ArrayList<Integer> A = new ArrayList<>();

        for (int i=0; i<K; i++) {
            A.add(Integer.parseInt(sc.next()));
        }

        Set<Integer> candidate = new HashSet<>();
        candidate.add(2);
        Collections.reverse(A);
        for (int Ai: A) {
            Set<Integer> nextCandidate = new HashSet<>();
            for (int num: candidate) {
                if (num % Ai == 0) {
                    for (int i=0; i<Ai; i++) {
                        nextCandidate.add(num+i);
                    }
                }
            }
            candidate = nextCandidate;
        }

        if (candidate.isEmpty()) {
            System.out.println(-1);
        }
        else {
            System.out.println(Collections.min(candidate) + " " + Collections.max(candidate));
        }
    }
}