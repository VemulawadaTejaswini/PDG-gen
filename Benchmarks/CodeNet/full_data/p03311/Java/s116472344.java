
import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
        solve();
    }

    public static void solve(){
        Scanner sc = new Scanner(System.in);
     	int n = sc.nextInt();
     	int[] a = new int[n];
     	int b = 0;
     	for(int i=0;i<n;i++){
     		a[i] = sc.nextInt();
     	}   
     	ArrayList<Integer> pos = new ArrayList<Integer>();
     	ArrayList<Integer> neg = new ArrayList<Integer>();
     	for(int i=0;i<n;i++){
     		if(a[i] - (i+1)>0){
     			pos.add(a[i] - (i+1));
     		}
     		else{
     			neg.add((int)Math.abs(a[i]-(i+1)));
     		}
     	}
     	Collections.sort(pos);
     	Collections.sort(neg);
     	if(pos.size()>neg.size()){
     		b = pos.get(pos.size()-neg.size()-1);
     	}
     	else if(neg.size()>pos.size()){
     		b = -neg.get(neg.size()-pos.size()-1);
     	}
     	long ans = 0;
     	for(int i=0;i<n;i++){
     		ans += (long)Math.abs(a[i]-(b+i+1));
     	}
     	System.out.println(ans);
    }
}