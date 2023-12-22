import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list=new ArrayList<String>(Arrays.asList(s.split("")));
		List<Integer> list_k=new ArrayList<Integer>();
		List<Integer> list_g=new ArrayList<Integer>();
		int[] array_k = new int[100000];
		int[] array_g = new int[100000];
		int n = sc.nextInt();
		for(int i=0;n>i;i++) {
			int a = sc.nextInt();
			if(i%2==0) {
				list_k.add(a);
				array_k[a]++;
			}
			else {
				list_g.add(a);
				array_g[a]++;
			}
		}
		int k_ren=0;
		for(int i=0;list_k.size()-1>i;i++) {
			if(list_k.get(i)==list_k.get(i+1))
				k_ren++;
		}
		if(k_ren+1==list_k.size()) {
			int g_ren=0;
			for(int i=0;list_g.size()-1>i;i++) {
				if(list_g.get(i)==list_g.get(i+1))
					g_ren++;
			}
			if(g_ren+1==list_g.size()&&list_g.get(0)!=list_k.get(0)) {
				System.out.println(0);
				System.exit(0);
			}
		}
		//System.out.println(array_k[3]);
		int k_one_sai = 0;
		int k_two_sai = 0;
		int g_one_sai = 0;
		int g_two_sai = 0;
		int k_one = 0;
		int k_two = 0;
		int g_one = 0;
		int g_two = 0;
		for(int i=0;100000>i;i++) {
			if(array_k[i]>k_one_sai) {
				k_two_sai = k_one_sai;
				k_one_sai = array_k[i];
				k_two = k_one;
				k_one = i;
			}
			else if(array_k[i]>k_two_sai) {
				k_two_sai = array_k[i];
				k_two = i;
			}
		}
		for(int i=0;100000>i;i++) {
			if(array_g[i]>g_one_sai) {
				g_two_sai = g_one_sai;
				g_one_sai = array_g[i];
				g_two = g_one;
				g_one = i;
			}
			else if(array_g[i]>g_two_sai) {
				g_two_sai = array_g[i];
				g_two = i;
			}
		}/*
		System.out.println(k_one);
		System.out.println(k_two);
		System.out.println(g_one);
		System.out.println(g_two);*/
		int k = 0;
		int g = 0;
		for(int i=0;list_k.size()>i;i++) {
			if(list_k.get(i)!=k_one)
				k++;
			else if(list_k.get(i)!=k_two)
				g++;
		}
		for(int i=0;list_g.size()>i;i++) {
			if(list_g.get(i)!=g_two)
				k++;
			else if(list_g.get(i)!=g_one)
				g++;
		}
		if(k>g)
			System.out.println(g);
		else
			System.out.println(k);
	}
}