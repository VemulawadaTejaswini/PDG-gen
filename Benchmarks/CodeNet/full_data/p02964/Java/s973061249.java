import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long K = sc.nextLong();
        List<Long> arrayA = new ArrayList<>();
        for (long i=0; i<N; i++) {
            arrayA.add(sc.nextLong());
        }
        sc.close();
        // List<Long> temp = new ArrayList<>(arrayA);
        // for (int i=0; i<K/2; i++) {
        //     arrayA.addAll(temp);
        // }
        List<Long> arrayS = new ArrayList<>();
        long count = 0;
        long d = 0;
        for (int i=0; i<K; i++) {
            for (int j=0; j<N; j++) {
                if (!arrayS.contains(arrayA.get(j))) {
                    arrayS.add(arrayA.get(j));
                }
                else {
                    while (arrayS.contains(arrayA.get(j))) {
                        arrayS.remove(arrayS.size()-1);
                    }
                }
            }
            if (K > 20 && arrayS.size() == 0) {
                count = i+1;
                d = K % count;
                break;
            }
        }
        for (int i=0; i<d; i++) {
            for (int j=0; j<N; j++) {
                if (!arrayS.contains(arrayA.get(j))) {
                    arrayS.add(arrayA.get(j));
                }
                else {
                    while (arrayS.contains(arrayA.get(j))) {
                        arrayS.remove(arrayS.size()-1);
                    }
                }
            }
        }
        if (arrayS.size() != 0) {
            for (int i=0; i<arrayS.size(); i++) {
                System.out.print(arrayS.get(i) + " ");
            }
        }
        else {
            System.out.println("");
        }

    }
}