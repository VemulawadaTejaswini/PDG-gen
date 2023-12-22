import java.io.File;
import java.io.FileInputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] count = new int[N];
		for(int i = 0; i < N; i++){
			int A = sc.nextInt();
			count[A]++;
		}
		
		if(N % 2 == 0){
			for(int i = 1; i <= N - 1; i += 2)
				if(count[i] != 2){
					System.out.println(0);
					return;
				}
			System.out.println((int)Math.pow(2, N / 2));
		}else{
			if(count[0] != 1){
				System.out.println(0);
				return;
			}
			for(int i = 2; i <= N - 1; i += 2)
				if(count[i] != 2){
					System.out.println(0);
					return;
				}
			System.out.println((int)Math.pow(2, (N - 1) / 2));
		}
	}
}