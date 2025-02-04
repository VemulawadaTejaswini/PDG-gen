import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        int k = in.nextInt();

        ArrayList<Long> xs = new ArrayList<>();
        ArrayList<Long> ys = new ArrayList<>();
        ArrayList<Long> zs = new ArrayList<>();
        ArrayList<Long> ttl = new ArrayList<>();
        ArrayList<Long> firstKs = new ArrayList<>();

        for (int i = 0; i < x; i++){
            xs.add(in.nextLong());
        }
        for (int i = 0; i < y; i++){
            ys.add(in.nextLong());
        }
        for (int i = 0; i < z; i++){
            zs.add(in.nextLong());
        }

        xs.sort(Comparator.naturalOrder());
        ys.sort(Comparator.naturalOrder());
        if (xs.size() > k)
            xs.addAll(xs.subList(xs.size() - k, xs.size()));
        if (ys.size() > k)
            xs.addAll(ys.subList(ys.size() - k, ys.size()));
        for (int i = 0; i < xs.size(); i++){
            for (int j = 0; j < ys.size(); j++){
                ttl.add(xs.get(i) + ys.get(j));
            }
        }

        ttl.sort(Comparator.naturalOrder());
        if (ttl.size() > k)
            ttl.addAll(ttl.subList(ttl.size() - k, ttl.size()));

        zs.sort(Comparator.naturalOrder());
        if (zs.size() > k)
            zs.addAll(zs.subList(zs.size() - k, zs.size()));

        for (int i = 0; i < ttl.size(); i++){
            for (int j = 0; j < zs.size(); j++){
                firstKs.add(ttl.get(i) + zs.get(j));
            }
        }

        firstKs.sort(Comparator.reverseOrder());
        ArrayList<Long> finalAnswer = new ArrayList<>();
        finalAnswer.addAll(firstKs.subList(0, k * 2));
        for (int i = 0; i < finalAnswer.size(); i+=2){
            System.out.println(finalAnswer.get(i));
        }
    }
}
