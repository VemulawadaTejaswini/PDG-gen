import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.math.*;
 
public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] str = br.readLine().split(" ");
		int h = Integer.parseInt(str[0]);
		int w = Integer.parseInt(str[1]);
		int pos = 0;
		for(int i = 0; i < h; i++){
			String a = br.readLine();
			for(int j = 0; j < w; j++){
				char c = a.charAt(i);
				if(c=='#'){
					if(i-pos<0 || i-pos>1){
						System.out.println("Impossible");
						return;
					}
					if(i-pos==1)
						pos = i;
				}else{
					if(i==pos){
						System.out.println("Impossible");
						return;
					}
				}
			}
		}
		System.out.println("Possible");
	}
}