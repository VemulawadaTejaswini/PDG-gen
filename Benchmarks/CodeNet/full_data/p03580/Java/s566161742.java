
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
		char[] c = s.toCharArray();
		sc.close();
		
		ArrayList<Integer> ic = new ArrayList<Integer>();
		ic.add(0);
		int l = 0;
		boolean c0 = false;
		if(c[0] == '1'){
			l = 1;
		}
		for(int i=1; i<s.length(); i++){
			if(c[i] == '0'){
				if(c[i-1] == '0'){
					c0 = true;
				}else{
					ic.add(l);
					l = 0;
				}
			}else{
				if(c[i-1] == '1'){
					l++;
				}else{
					if(c0){
						ic.add(0);
						c0 = false;
					}
					l = 1;
				}
			}
		}
		
		if(l!= 0) ic.add(l);
		if(c[num-1] == '0' && c[num-2] == '1') ic.add(0);
		for(int i=1; i<ic.size()-1; i++){
			if(ic.get(i-1) == 0 && ic.get(i+1) == 0){
				ic.remove(i);
				ic.remove(i);
				i--;
			}
		}
		
		int ans = 0;
		
		int cont1 = 0;
		for(int i=0; i<ic.size()-1; i++){
			if(ic.get(i) == 1){
				cont1++;
				if(ic.get(i+1) == 1){
					ic.remove(i);
					i--;
				}
			}else{
				ans += cont1/2;
				cont1 = 0;
			}
		}
		ans += cont1/2;
		
		for(int i=1; i<ic.size()-1; i++){
			if(ic.get(i-1) == 0 && ic.get(i+1) == 0){
				ic.remove(i);
				ic.remove(i);
				i--;
			}
		}
		
		int min = 1000000;
		boolean edge = false;
		int now = 0;
		for(int i=1; i<ic.size()-1; i++){
			now = ic.get(i);
			if(now == 0){
				if(i!=0 && min!= 1000000){
					ans -= min;
					min = 1000000;
				}
			}else{
				ans += now;
				if(i == 0 || i == ic.size()-1){
					if(min > now && (now != 1 && ic.get(i-1) >1 && ic.get(i+1) >1)){
						min = now;
					}
				}else if(ic.get(i-1) == 0 || ic.get(i+1) == 0){
					if(min > now && (now != 1 && ic.get(i-1) >1 && ic.get(i+1) >1)){
						min = now;
					}
				}else{
					if(min -2 > now && (now != 1 && ic.get(i-1) >1 && ic.get(i+1) >1)){
						min = now -2;
					}
				}
			}
		}
		if(min!= 1000000){
			ans -= min;
			min = 1000000;
		}
		
		System.out.println(ans);
		
	}
}
