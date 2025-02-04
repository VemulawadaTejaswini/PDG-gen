
import java.io.PrintWriter;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);
        Scanner sc = new Scanner(System.in);
        Task task = new Task();
        task.solve(sc, out);
        out.flush();
        sc.close();
    }

    static class Task {
        public void solve(Scanner sc, PrintWriter out) {
            int N = nint(sc);
            int M = nint(sc);
            // + + +
            List<Long> ppp = new ArrayList<>();
            // + + -
            List<Long> ppn = new ArrayList<>();
            // + - -
            List<Long> pnn = new ArrayList<>();
            // - - -
            List<Long> nnn = new ArrayList<>();
            // - + +
            List<Long> npp = new ArrayList<>();
            // - - +
            List<Long> nnp = new ArrayList<>();
            // - + -
            List<Long> npn = new ArrayList<>();
            // + - +
            List<Long> pnp = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                long a = nlong(sc);
                long b = nlong(sc);
                long c = nlong(sc);
                ppp.add(a + b + c);
                ppn.add(a + b - c);
                pnn.add(a - b - c);
                nnn.add(-a - b - c);
                npp.add(-a + b + c);
                nnp.add(-a - b + c);
                npn.add(-a + b -c);
                pnp.add(a - b + c);
            }
            List<Long> pppSorted = ppp.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
            List<Long> ppnSorted =ppn.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
            List<Long> pnnSorted =pnn.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
            List<Long> nnnSorted =nnn.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
            List<Long> nppSorted =npp.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
            List<Long> nnpSorted =nnp.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
            List<Long> npnSorted =npn.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
            List<Long> pnpSorted =pnp.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

            List<Long> resultList = new ArrayList<>();

            long pppTopM = IntStream.range(0, M).mapToLong(i -> pppSorted.get(i)).sum();
            resultList.add(pppTopM);
            long ppnTopM = IntStream.range(0, M).mapToLong(i -> ppnSorted.get(i)).sum();
            resultList.add(ppnTopM);
            long pnnTopM = IntStream.range(0, M).mapToLong(i -> pnnSorted.get(i)).sum();
            resultList.add(pnnTopM);
            long nnnTopM = IntStream.range(0, M).mapToLong(i -> nnnSorted.get(i)).sum();
            resultList.add(nnnTopM);
            long nppTopM = IntStream.range(0, M).mapToLong(i -> nppSorted.get(i)).sum();
            resultList.add(nppTopM);
            long nnpTopM = IntStream.range(0, M).mapToLong(i -> nnpSorted.get(i)).sum();
            resultList.add(nnpTopM);
            long npnTopM = IntStream.range(0, M).mapToLong(i -> npnSorted.get(i)).sum();
            resultList.add(npnTopM);
            long pnpTopM = IntStream.range(0, M).mapToLong(i -> pnpSorted.get(i)).sum();
            resultList.add(pnpTopM);
            long result = resultList.stream().max(Comparator.naturalOrder()).get();
            out.println(result);



        }
    }

    static int nint(Scanner sc) {
        return Integer.parseInt(sc.next());
    }

    static long nlong(Scanner sc) {
        return Long.parseLong(sc.next());
    }

    static double ndouble(Scanner sc) {
        return Double.parseDouble(sc.next());
    }

    static float nfloat(Scanner sc) {
        return Float.parseFloat(sc.next());
    }

    static String nstr(Scanner sc) {
        return String.valueOf(sc.next());
    }

    static long[] longLine(Scanner sc, int size) {
        long[] lLine = new long[size];
        for (int i = 0; i < size; i++) {
            lLine[i] = nlong(sc);
        }
        return lLine;
    }

    static int[] intLine(Scanner sc, int size) {
        int[] iLine = new int[size];
        for (int i = 0; i < size; i++) {
            iLine[i] = nint(sc);
        }
        return iLine;
    }

    static String[] strLine(Scanner sc, int size) {
        String[] strLine = new String[size];
        for (int i = 0; i < size; i++) {
            strLine[i] = nstr(sc);
        }
        return strLine;
    }

    static long maxFromList(List<Long> longList) {
        return longList.stream().max(Comparator.naturalOrder()).get();
    }

    static long minFromList(List<Long> longList) {
        return longList.stream().min(Comparator.naturalOrder()).get();
    }

    public static int sumDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static long sumDigits(long n) {
        long sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    static List<Integer> getIntegerList(Scanner sc, int size) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(nint(sc));
        }
        return list;
    }

    static List<Long> getLongList(Scanner sc, int size) {
        List<Long> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(nlong(sc));
        }
        return list;
    }
}
