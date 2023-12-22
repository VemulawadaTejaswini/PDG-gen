import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());

        PriorityQueue<Restaurant> pq = new PriorityQueue<>();

        for(int i=0; i<N; i++){
            StringTokenizer stringTokenizer = new StringTokenizer(scanner.nextLine());

            String s = stringTokenizer.nextToken();
            int p = Integer.parseInt(stringTokenizer.nextToken());

            pq.add(new Restaurant(s, p, i+1));
        }

        for(int i=0; i<N; i++){
            Restaurant r = pq.poll();
            System.out.println(r.id);
        }
    }


    public static class Restaurant implements Comparable<Restaurant>{

        String city;
        int point;
        int id;

        public Restaurant(String city, int point, int id){
            this.city = city;
            this.point = point;
            this.id = id;
        }

        @Override
        public int compareTo(Restaurant r) {
            if(this.city.equals(r.city)){
                if(this.point > r.point){
                    return -1;
                }else{
                    return 1;
                }
            }else{
                if(this.city.compareTo(r.city) < 0){
                    return -1;
                }else{
                    return 1;
                }
            }
        }
    }
}
