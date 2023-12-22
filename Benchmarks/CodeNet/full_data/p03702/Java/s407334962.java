import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int A= s.nextInt();
		int B = s.nextInt();
		int[] creatures = new int[size];
		for (int i = 0; i < size; i++) {
			creatures[i]=s.nextInt();
		}
		Arrays.sort(creatures);
		int count = 0;
		while(creatures[creatures.length-1]>0){
			creatures = attack(A,B,creatures);
			count ++;
		}
		System.out.println(count);
	}
	public static int[] attack(int A, int B, int[] creatures){
		for (int i = 0; i < creatures.length-1; i++) {
			creatures[i]-=B;
		};
		creatures[creatures.length-1] -=A;
		Arrays.sort(creatures);
		return creatures;
	}
}
