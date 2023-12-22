import java.util.*;


class Main{
  
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
     int x = sc.nextInt();
     int y = sc.nextInt();
     int z = sc.nextInt();
     int haba = x + z*2;
     int ans = haba/(y+z);
      System.out.println(ans);
	}
}

