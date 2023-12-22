import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Zahyo> zahyoList = new ArrayList<>();
        Set<Zahyo> zahyoSet = new HashSet<>();

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            Zahyo zahyo = new Zahyo(x, y);
            zahyoList.add(zahyo);
            zahyoSet.add(zahyo);
        }
        sc.close();

        for (int i = 0; i < zahyoList.size(); i++) {
            Zahyo zahyoI = zahyoList.get(i);
            for (int j = i + 1; j < zahyoList.size(); j++) {
                Zahyo zahyoJ = zahyoList.get(j);

                if (zahyoI.x == zahyoJ.x || zahyoI.y == zahyoJ.y) {
                    continue;
                }

                Zahyo kouho1 = new Zahyo(zahyoI.x, zahyoJ.y);
                Zahyo kouho2 = new Zahyo(zahyoJ.x, zahyoI.y);
                if (zahyoSet.contains(kouho1)) {
                    if (zahyoSet.contains(kouho2)) {
                        continue;
                    } else {
                        zahyoList.add(kouho2);
                        zahyoSet.add(kouho2);
                    }
                } else {
                    if (zahyoSet.contains(kouho2)) {
                        zahyoList.add(kouho1);
                        zahyoSet.add(kouho1);
                    } else {
                        continue;
                    }
                }
            }
        }

        System.out.println(zahyoList.size() - N);
    }

    private static class Zahyo {
        int x;
        int y;

        public Zahyo(int x, int y) {
            super();
            this.x = x;
            this.y = y;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + x;
            result = prime * result + y;
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Zahyo other = (Zahyo) obj;
            if (x != other.x)
                return false;
            if (y != other.y)
                return false;
            return true;
        }

    }

}
