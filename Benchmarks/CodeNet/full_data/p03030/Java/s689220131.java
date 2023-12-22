import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        List<Restaurant> list = new ArrayList();
        for(int i = 1; i <= n; i++){
            Restaurant r = new Restaurant(i, sc.next(), Integer.parseInt(sc.next()));
            list.add(r);
        }
        
        list.sort((o1, o2) -> o2.point - o1.point);
        list.sort((o1, o2) -> o1.city.compareTo(o2.city));
        
        for(int i = 0; i < n; i++){
            System.out.println(list.get(i).id);
        }
    }
}

class Restaurant {
    int id;
    String city;
    int point;
    
    Restaurant(int id, String city, int point){
        this.id = id;
        this.city = city;
        this.point = point;
    }
}