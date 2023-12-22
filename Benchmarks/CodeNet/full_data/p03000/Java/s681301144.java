import java.awt.TexturePaint;
import java.awt.event.ComponentAdapter;
import java.io.BufferedReader;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int first = Integer.parseInt(sc.next()); 
		int second = Integer.parseInt(sc.next()); 
		int[] dis = new int[first];
		for(int i=0; i<first; i++) {
			dis[i] = Integer.parseInt(sc.next());
		}
		int now = 0;
		int count = 1;
		
		for(int i=0; i<first; i++) {
			now += dis[i];
			if(now > second) {
				break;
			}
			count++;
		}
		System.out.println(count);
	}
}