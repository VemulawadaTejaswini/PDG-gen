import java.util.*;

class Pair {
    int A, B;

    Pair(int A, int B) {
        this.A = A;
        this.B = B;
    }

    int getA() {
        return this.A;
    }

    int getB() {
        return this.B;
    }
}

class MyComparator implements Comparator<Pair>{
	public int compare(Pair Pair1, Pair Pair2) {
		return Pair1.getB() - Pair2.getB();
	}
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Pair[] Ps = new Pair[N];
        for(int i = 0; i < N; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            Pair pair = new Pair(A,B);
            Ps[i] = pair;
        }
        Arrays.sort(Ps, new MyComparator());

        long sum = 0;
        boolean cando = true;
        for(int i = 0; i< N; i++) {
            sum += (long)Ps[i].A;
            if(sum > (long)Ps[i].B) {
                cando = false;
                break;
            }
        }
        if(cando) System.out.println("Yes");
        else System.out.println("No");
        sc.close();
    }
}