import java.util.*;
import static java.util.Comparator.*;
class Restaurant {
    private String city;
    private int score;
    private int index;
    public Restaurant(String city, int score, int index) {
        this.city = city;
        this.score = score;
        this.index = index;
    }
    public String getCity() {return this.city;}
    public int getScore() {return this.score;}
    public int getIndex() {return this.index;}
}
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();        
        List<Restaurant> rstList = new ArrayList<>();
        for(int i = 1; i <= N; i++) {
            rstList.add(new Restaurant(stdIn.next(), -stdIn.nextInt(), i));
        }
        rstList.sort(comparing(Restaurant::getCity).thenComparing(Restaurant::getScore));
        for(Restaurant rst : rstList) {
            System.out.println(rst.getIndex());
        }
    }
}