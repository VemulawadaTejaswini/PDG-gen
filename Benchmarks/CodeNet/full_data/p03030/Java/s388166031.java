import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] split;
        
        int size = Integer.parseInt(line);
        
        ArrayList<Restaurant> data = new ArrayList<>();
        
        for (int i = 0; i < size; i++) {
			line = sc.nextLine();
	        split = line.split(" ");
	        
	        data.add(new Restaurant(i+1, split[0], Integer.parseInt(split[1])));
		}
        
        calculate(data);
        for (int i = 0; i < data.size(); i++) {
			System.out.println(data.get(i).id);
		}
	}
	
	public static ArrayList<Restaurant> calculate(ArrayList<Restaurant> list) {
		list.sort((p1, p2) -> p2.point - p1.point);
		list.sort((p1, p2) -> p1.city.compareTo(p2.city));
		return list;
	}

}

class Restaurant {
	int id;
	String city;
	int point;
	
	public Restaurant(int id, String city, int point) {
		this.id = id;
		this.city = city;
		this.point = point;
	}
	
	@Override
	public String toString() {
		return id + city + point;
	}
}