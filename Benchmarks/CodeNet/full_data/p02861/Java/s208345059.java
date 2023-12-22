import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<City> cities = new ArrayList<>();
        for(int i = 0;i < n;i++){
            String[] ints = sc.nextLine().split(" ");
            int x = Integer.parseInt(ints[0]);
            int y = Integer.parseInt(ints[1]);
            cities.add(new City(x,y));
        }
        List<Double> distanceList = new ArrayList<>();
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                City city1 = cities.get(i);
                City city2 = cities.get(j);
                int x1 = city1.x;
                int y1 = city1.y;
                int x2 = city2.x;
                int y2 = city2.y;
                distanceList.add(Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)));
            }
        }
        double result = 0;
        for(Double d : distanceList){
            result += d;
        }
        System.out.println(result / n);

    }
}

class City{
    public int x;
    public int y;
    public City(int x,int y){
        this.x = x;
        this.y = y;
    }
}