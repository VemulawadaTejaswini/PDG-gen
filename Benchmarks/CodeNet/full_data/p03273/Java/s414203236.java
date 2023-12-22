import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		HashMap hs = new HashMap();
		PrintWriter ou = new PrintWriter(System.out);
		int h = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());
		char[][] a = new char[h][w];
		for(int i = 0 ; i < h ; i++){
			String s = sc.next();
			for(int j = 0 ; j < w ; j++){
				a[i][j] = s.charAt(j);
			}
		}
		sc.close();
		for(int i = 0 ; i < h ; i++){
			boolean ebishu = true;
			for(int j = 0 ; ebishu && j < w ; j++){
				if(a[i][j] == '#') ebishu = false;
			}
			if(ebishu){
				for(int j = 0 ; j < w ; j++){
					a[i][j] = '鶏';
				}
			}
		}
		for(int i = 0 ; i < w ; i++){
			boolean ebishu = true;
			for(int j = 0 ; ebishu && j < h ; j++){
				if(a[j][i] == '#') ebishu = false;
			}
			if(ebishu){
				for(int j = 0 ; j < h ; j++){
					a[j][i] = '鶏';
				}
			}
		}
		for(int i = 0 ; i < h ; i++){
			boolean ebishu = false;
			for(int j = 0 ; j < w ; j++){
				if(a[i][j] != '鶏'){
					ebishu = true;
					ou.print(a[i][j]);
				}
			}
			if(ebishu) ou.print("\n");
		}
		ou.flush();
	}
}