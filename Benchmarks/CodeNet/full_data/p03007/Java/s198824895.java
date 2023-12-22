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
		ArrayList<Integer> minusList = new ArrayList<Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; sc.hasNext(); i++) {
			int value = Integer.parseInt(sc.next());
			if(value<=0) {
				minusList.add(value);
			}else {
				list.add(value);
			}
		}
		Collections.sort(minusList);
		Collections.sort(list);
		
		ArrayList<String> textList = new ArrayList<String>();
		int minusLists = minusList.size();
		int lists = list.size();
		
		if(minusList.size() > 0) {
			if(list.size()>0) {
				for(int i=0; i<minusLists-1; i++) {
					textList.add((list.get(0) + " " + minusList.get(0)).toString());
					list.add(1, list.get(0)-minusList.get(0));
					minusList.remove(0);
					list.remove(0);
				}
				for(int i=0; i<lists-1;i++) {
					textList.add((minusList.get(0) + " " + list.get(0)).toString());
					minusList.add(minusList.get(0)-list.get(0));
					minusList.remove(0);
					list.remove(0);
				}
				textList.add((list.get(0) + " " + minusList.get(0)).toString());
				System.out.println(list.get(0)-minusList.get(0));
			}else {
				textList.add((minusList.get(0)+" "+minusList.get(minusList.size()-1)).toString());
				list.add(minusList.get(0) - minusList.get(minusList.size()-1));
				minusList.remove(minusList.size()-1);
				minusList.remove(0);
				if(minusList.size()==0) {
					System.out.println(list.get(0));
				}else {
					for(int i=0; i<minusLists-1; i++) {
						textList.add((list.get(0) + " " + minusList.get(0)).toString());
						list.add(1, list.get(0)-minusList.get(0));
						minusList.remove(0);
						list.remove(0);
					}
					textList.add((list.get(0) + " " + minusList.get(0)).toString());
					System.out.println(list.get(0)-minusList.get(0));
				}
			}
		}else {
			textList.add((list.get(0)+" "+list.get(list.size()-1)).toString());
			minusList.add(list.get(0)-list.get(list.size()-1));
			list.remove(list.size()-1);
			list.remove(0);
			if(list.size()==0) {
				System.out.println(minusList.get(0));
			}else {
				for(int i=0; i<lists-1;i++) {
					textList.add((minusList.get(0) + " " + list.get(0)).toString());
					minusList.add(minusList.get(0)-list.get(0));
					minusList.remove(0);
					list.remove(0);
				}
				textList.add((list.get(0) + " " + minusList.get(0)).toString());
				System.out.println(list.get(0)-minusList.get(0));
			}
		}
		for(String s:textList) {
			System.out.println(s);
		}
	}
}