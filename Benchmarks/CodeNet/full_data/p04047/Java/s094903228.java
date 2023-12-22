package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BBQEasy {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] s = br.readLine().split(" ");
		ArrayList<Integer> l = new ArrayList<Integer>();
		for(int i =0;i <2*N;i++){
			l.add(Integer.parseInt(s[i]));
		}
		Collections.sort(l);
		int result = 0;
		for(int i =0;i<2*N;i+=2){
			result += l.get(i) > l.get(i+1)? l.get(i+1):l.get(i);
		}
		System.out.println(result);
	}

}
