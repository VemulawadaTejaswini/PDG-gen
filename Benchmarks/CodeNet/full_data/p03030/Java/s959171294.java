import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
        List<Restaurant> list = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            String city = sc.next();
            int score = sc.nextInt();
            list.add(new Restaurant(city, score, i));
        }
        Collections.sort(list);
        for(Restaurant res: list){
        	System.out.println(res.i);
        }
    }
}
class Restaurant implements Comparable<Restaurant>{
	String city;
    int score;
    int i;
    public Restaurant(String city, int score, int i){
    	this.city = city;
        this.score = score;
        this.i = i;
    }
    public int compareTo(Restaurant other){
    	int ans = city.compareTo(other.city);
        if(ans != 0){
        	return ans;
        }
        return Integer.compare(other.score, score);
    }
}