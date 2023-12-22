import java.util.*;

class restaurant{
	int id;
	String city;
	int point;
	
	public restaurant(int id, String city, int point){
		this.id = id;
		this.city = city;
		this.point = point;
	}
	
	static int RestaurantCompare(restaurant r1, restaurant r2){
		if(StringCompare(r1.city, r2.city) != 0){
			return StringCompare(r1.city, r2.city);
		}
		else{
			if(r1.point > r2.point){
				return 1;
			}
			else if (r1.point < r2.point){
				return -1;
			}
			else{
				return 0;
			}
		}
	}
	
	static int StringCompare(String s1, String s2){
		String[] s1_split = s1.split("");
		String[] s2_split = s2.split("");
		int length = Math.min(s1_split.length, s2_split.length);
		int longer = 0;
		if(s1_split.length > s2_split.length){
			longer = -1;
		}
		else if(s1_split.length < s2_split.length){
			longer = 1;
		}
		else{
			longer = 0;
		}
		
		for(int i=0; i<length; i++){
			if(StrToNum(s1_split[i]) < StrToNum(s2_split[i])){
				return 1;
			}
			if(StrToNum(s1_split[i]) > StrToNum(s2_split[i])){
				return -1;
			}
		}
		return longer;
	}
	
	static int StrToNum(String s){
		switch(s){
			case "a":
				return 1;
			case "b":
				return 2;
			case "c":
				return 3;
			case "d":
				return 4;
			case "e":
				return 5;
			case "f":
				return 6;
			case "g":
				return 7;
			case "h":
				return 8;
			case "i":
				return 9;
			case "j":
				return 10;
			case "k":
				return 11;
			case "l":
				return 12;
			case "m":
				return 13;
			case "n":
				return 14;
			case "o":
				return 15;
			case "p":
				return 16;
			case "q":
				return 17;
			case "r":
				return 18;
			case "s":
				return 19;
			case "t":
				return 20;
			case "u":
				return 21;
			case "v":
				return 22;
			case "w":
				return 23;
			case "x":
				return 24;
			case "y":
				return 25;
			case "z":
				return 26;
		}
		return 0;
	}
	
	static void quick_sort(restaurant[] d, int left, int right) {
		if(left>=right){
				return;
		}
		restaurant p = d[(left+right)/2];
		int l = left, r = right;
		restaurant tmp;
		while(l<=r){
			while(RestaurantCompare(d[l], p) > 0){ l++; }
			while(RestaurantCompare(d[r], p) < 0){ r--; }
			if (l<=r) {
				tmp = d[l]; d[l] = d[r]; d[r] = tmp;
				l++;
				r--;
			}
		}
		quick_sort(d, left, r);
		quick_sort(d, l, right);
	}
}

public class Main{
	public static void main(String[] args){
		int ans = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		restaurant[] rs = new restaurant[n];
		
		for(int i=0; i<n; i++){
			rs[i] = new restaurant(i+1, sc.next(), sc.nextInt());
		}
		
		restaurant.quick_sort(rs, 0, n-1);
		
		for(int i=0; i<n; i++){
			System.out.println(rs[i].id);
		}
	}
}
