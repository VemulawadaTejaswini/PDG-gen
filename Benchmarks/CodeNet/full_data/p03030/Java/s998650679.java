import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
 
class Menu{
	private String city;
	private int test;
	private int number;
 
	public Menu(String city, int test,int number)
	{
		this.city =city;
		this.test = test;
		this.number = number;
	}
 
	public String getCity()
	{
		return city;
	}
 
	public int getTest()
	{
		return test;
	}
 
	public void setCity(String city)
	{
		this.city = city;
	}
 
	public void setTest(int test)
	{
		this.test = test;
	}
	public int getNumber()
	{
		return number;
	}
}
 
class MyComp implements Comparator<Menu> {
    public int compare(Menu c1, Menu c2) {
        if(c1.getTest() > c2.getTest()) {
            return -1;
        } else if(c1.getTest() < c2.getTest()) {
            return 1;
        } else {
            return c1.getCity().compareTo(c2.getCity());
        }
    }
}
 
class MyCompare implements Comparator<Menu> {
    public int compare(Menu c1, Menu c2) {
    	String d1 = c1.getCity();
    	String d2 = c2.getCity();
    	int num = d1.compareTo(d2);
 
        if(num < -1) {
            return -1;
        } else if(num > 1) {
            return 1;
        } else {
        	if(c1.getTest() > c2.getTest()) {
                return -1;
            } else if(c1.getTest() < c2.getTest()) {
                return 1;
            }else if(c1.getTest() == c2.getTest()) {
            	return 0;
            }
        }
        return 0;
    }
}
 
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
 
		ArrayList<Menu> arr = new ArrayList<Menu>();
		for(int i = 0; i < N; i++)
		{
 
			String s = sc.next();
			int p = sc.nextInt();
			int j = i + 1;
			Menu menu = new Menu(s, p,j);
			arr.add(menu);
			
		}
 
		Collections.sort(arr,new MyCompare());
		for(Menu c : arr) {
            System.out.println(c.getNumber());
        }
 
	}
}