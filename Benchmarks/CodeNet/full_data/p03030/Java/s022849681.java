import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Restaurant> list = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            list.add(new Restaurant(i, sc.next(), sc.nextInt()));
        }
        Collections.sort(list, new RestaurantComparator());
        
        for(Restaurant r : list) {
            System.out.println(r.getIndex());
        }
    }
}

class Restaurant {
    private int index;
    private String name;
    private int score;
    
    public Restaurant(int index, String name, int score) {
        this.index = index;
        this.name = name;
        this.score = score;
    }
    
    public int getIndex() {
        return index;
    }
    
    public String getName() {
        return name;
    }
    
    public int getScore() {
        return score;
    }
}

class RestaurantComparator implements Comparator<Restaurant> {
    public int compare(Restaurant r1, Restaurant r2) {
        if(r1.getName().equals(r2.getName())) {
            return r2.getScore() - r1.getScore();
        } else {
            return r1.getName().compareTo(r2.getName());
        }
    }
} 