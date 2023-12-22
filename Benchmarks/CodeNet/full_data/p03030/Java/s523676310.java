import java.util.*;

public class Main{

    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Restaurant[] r = new Restaurant[n];
        for(int i = 0; i < n; i++){
            r[i] = new Restaurant(scan.next(), scan.nextInt(), i + 1);
        }
        Arrays.sort(r);
        for(int i = 0; i < n; i++) System.out.println(r[i].index);
    }

    public class Restaurant implements Comparable<Restaurant>{

        String place;
        int score;
        int index;

        public Restaurant(String place, int score, int index){
            this.place = place;v
            this.score = score;
            this.index = index;
        }


        @Override
        public int compareTo(Restaurant r) {
            if(!r.place.equals(this.place)) return this.place.compareTo(r.place);
            return Integer.compare(r.score, this.score);
        }

        @Override
        public String toString(){
            return this.place + " " + this.score + " " + this.index;
        }
    }


    public static void main(String[] args){
        new Main().solve();
    }
}
