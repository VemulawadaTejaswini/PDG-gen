import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[][] points = new int[count][count];
        for (int i = 0; i < count; ++i) {
            for (int j = 0; j < count; ++j) {
                points[i][j] = scanner.nextInt();
            }
        }

        List<List<Byte>> sequences = new ArrayList<>();
        List<Byte> zero = Collections.nCopies(count, (byte) 0);
        sequences.add(zero);

        Map<List<Byte>, Long> score = new HashMap<>();
        score.put(zero, 0L);

        for (int i = 0; i < count; ++i) {
            List<List<Byte>> newSequences = new ArrayList<>();
            for (List<Byte> seq : sequences) {
                long curScore = score.get(seq);
                for (int j = 0; j < i; ++j) {
                    if (seq.get(j) == 1) {
                        curScore += points[i][j];
                    }
                }
                List<Byte> newSeq = new ArrayList<>(seq);
                newSeq.set(i, (byte) 1);
                score.put(newSeq, curScore);
                newSequences.add(newSeq);
                newSequences.add(seq);
            }
            sequences = newSequences;
        }

        sequences = new ArrayList<>();
        sequences.add(zero);
        Map<List<Byte>, Long> sumScore = new HashMap<>();
        sumScore.put(zero, 0L);

        for (int i = 0; i < count; ++i) {
            List<List<Byte>> newSequences = new ArrayList<>();
            for (List<Byte> seq : sequences) {
                List<Byte> seq1 = new ArrayList<>(zero);
                List<Byte> seq2 = new ArrayList<>(zero);
                List<Byte> seqBoth = new ArrayList<>(zero);

                for (int j = 0; j < i; ++j) {
                    if (seq.get(j) == 1) {
                        seq1.set(j, (byte) 1);
                    } else if (seq.get(j) == 2) {
                        seq2.set(j, (byte) 1);
                    }
                    seqBoth.set(j, (byte) 1);
                }

                seq1.set(i, (byte) 1);
                seqBoth.set(i, (byte) 1);
                sumScore.put(seqBoth, Math.max(
                        score.get(seq1) + score.get(seq2),
                        sumScore.getOrDefault(seqBoth, 0L)));

                seq1 = new ArrayList<>(seq);
                seq1.set(i, (byte) 1);
                seq2 = new ArrayList<>(seq);
                seq2.set(i, (byte) 2);
                newSequences.add(seq1);
                newSequences.add(seq2);
                newSequences.add(seq);
            }
            sequences = newSequences;
        }

        System.out.println(sumScore.get(Collections.nCopies(count, (byte) 1)));
    }
}
