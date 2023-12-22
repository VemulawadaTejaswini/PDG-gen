import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = scanner.nextInt();
        Show[] shows = new Show[n];
        for (int i = 0; i < shows.length; i++) {
            shows[i] = new Show(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        }
        Arrays.sort(shows);
        int recs = 1;
        int[] recChannel = new int[c + 1];
        Arrays.fill(recChannel, -1);
        recChannel[recs] = 0;
        for (int i = 1; i < shows.length; i++) {
            boolean free = false;
            for (int j = 1; j < recChannel.length; j++) {
                if (recChannel[j] == -1)break;
                else  if(!(shows[i].s <= shows[recChannel[j]].t && shows[i].c != shows[recChannel[j]].c)){
                    free = true;
                    recChannel[j] = i;
                    break;
                }
            }
            if (!free){
                recs++;
                recChannel[recs] = i;
            }
        }
        System.out.println(recs);
    }
}

class Show implements Comparable<Show>{
    int s, t, c;

    Show(int s, int t, int c) {
        this.s = s;
        this.t = t;
        this.c = c;
    }

    @Override
    public int compareTo(Show o) {
        if (s - o.s == 0) return t - o.t;
        return s - o.s;
    }
}