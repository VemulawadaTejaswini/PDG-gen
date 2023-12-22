/*
 *ver2
 *絶対値の最小値を比較することを検討
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	
	int n = scan.nextInt();
	int[] a = new int[n];
	ArrayList<Integer> p = new ArrayList<Integer>();
	ArrayList<Integer> m = new ArrayList<Integer>();

	//数列を正負で可変長配列に格納
	for(int i = 0; i < n; i++){
	    a[i] = scan.nextInt();
	    if(a[i] < 0){
		m.add(a[i]);
	    }else{
		p.add(a[i]);
	    }
	}
		  
	Collections.sort(m);
	Collections.sort(p);

	long mSum = 0;
	
	//負数が偶数個の場合
	if(m.size() % 2 == 0){
	    for(int data : m){
		mSum += data;
	    }
	    mSum = Math.abs(mSum);
	}
	//負数が奇数個の場合
	else{
	    //負数の絶対値の最小値 < 正数の絶対値の最小値
	    if(Math.abs(m.get(m.size()-1)) < p.get(0)){
		for(int data : m){
		    mSum += data;
		}
		mSum = Math.abs(mSum) + m.get(m.size()-1);
		//負数の絶対値の最小値 > 正数の絶対値の最小値
	    }else{
		int hanten = p.get(0);
		p.set(0, -1*hanten);
		for(int data : m){
		    mSum += data;
		}
		mSum = Math.abs(mSum);
	    }
	}

	long pSum = 0;
	for(int data : p){
	    pSum += data;
	}

	long sum = pSum+mSum;

	System.out.println(sum);
    }
}
