import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
 
 
public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int N = Integer.parseInt(sc.next());
		List<Shop> shops = new ArrayList<>();
		int count = 1;
		for(int i=0;i<N;i++){
			Shop shop = new Shop(sc.next(),Integer.parseInt(sc.next()),i+1);
			shops.add(shop);
		}
		//System.out.println(shops.get(0).name);
		shops.sort((a,b)->{
			if(a.name.equals(b.name)){
				return Integer.compare(b.point,a.point);
			}else{
				return a.name.compareTo(b.name);
			}
		});
		for(Shop s : shops){
			System.out.println(s.number);
		}
		
		
	}
	
}
class Shop{
	String name;
	int point;
	int number;
	public Shop(String name, int point, int number) {
		this.name = name;
		this.point = point;
		this.number = number;
		// TODO Auto-generated constructor stub
	}
}

