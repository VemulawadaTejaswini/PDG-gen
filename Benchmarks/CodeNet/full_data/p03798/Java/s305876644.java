import java.util.Arrays;
import java.util.Scanner;

public class Main {
	int n;
	String s;
	String[] sw;
	
	public static void main(String[] args){
		new Main().solve();
	}
	
	public void solve(){
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		s=sc.next();
		sw=new String[n];
		
		
		//パターン１
		sw[0]="S";
		if(s.charAt(0)=='o'){
			sw[1]="S";
		}
		solve2();
		if(sw[n-1]=="S" && sw[0]=="S"){
			for(int i=0;i<n;i++)System.out.print(sw[i]);
			return;
		}
		Arrays.fill(sw, "");
		//パターン２
		sw[0]="S";
		if(s.charAt(0)=='o'){
			sw[1]="W";
		}
		solve2();
		if(sw[n-1]=="W"&& sw[0]=="S"){
			for(int i=0;i<n;i++)System.out.print(sw[i]);
			return;
		}
		Arrays.fill(sw, "");
		//パターン３
		sw[0]="S";
		if(s.charAt(0)=='x'){
			sw[1]="S";
		}
		solve2();
		if(sw[n-1]=="W" &&sw[0]=="S"){
			for(int i=0;i<n;i++)System.out.print(sw[i]);
			return;
		}
		Arrays.fill(sw, "");
		//パターン４
		sw[0]="S";
		if(s.charAt(0)=='x'){
			sw[1]="W";
		}
		solve2();
		if(sw[n-1]=="S"&&sw[0]=="S"){
			for(int i=0;i<n;i++)System.out.print(sw[i]);
			return;
		}
		Arrays.fill(sw,"");
		//パターン５
		sw[0]="W";
		if(s.charAt(0)=='o'){
			sw[1]="S";
		}
		solve2();
		if(sw[n-1]=="W"&&sw[0]=="W"){
			for(int i=0;i<n;i++)System.out.print(sw[i]);
			return;
		}
		Arrays.fill(sw, "");
		//パターン６
		sw[0]="W";
		if(s.charAt(0)=='o'){
			sw[1]="W";
		}
		solve2();
		if(sw[n-1]=="S"&&sw[0]=="W"){
			for(int i=0;i<n;i++)System.out.print(sw[i]);
			return;
		}
		Arrays.fill(sw, "");
		//パターン７
		sw[0]="W";
		if(s.charAt(0)=='x'){
			sw[1]="S";
		}
		solve2();
		if(sw[n-1]=="S"&&sw[0]=="W"){
			for(int i=0;i<n;i++)System.out.print(sw[i]);
			return;
		}
		Arrays.fill(sw, "");
		//パターン８
		sw[0]="W";
		if(s.charAt(0)=='x'){
			sw[1]="W";
		}
		solve2();
		if(sw[n-1]=="W"&&sw[0]=="W"){
			for(int i=0;i<n;i++)System.out.print(sw[i]);
			return;
		}
		Arrays.fill(sw, "");
		System.out.println("-1");
	}
	public void solve2(){
		if(n==3){
			for(int i=2;i<n;i++){
				if((sw[i]=="S"&&s.charAt(i)=='o')||(sw[i]=="W"&&s.charAt(i)=='x')){
					if(i!=n-1)
						sw[i+1]=sw[i-1];
					if(i==n-1)
						sw[0]=sw[i-1];
				}else{
					if(i!=n-1){
						if(sw[i-1]=="S")sw[i+1]="W";
						if(sw[i-1]=="W")sw[i+1]="S";
					}
					if(i==n-1){
						if(sw[i-1]=="S")sw[0]="W";
						if(sw[i-1]=="W")sw[0]="S";
					}
				}
			}
		}else{
		for(int i=1;i<n;i++){
			if((sw[i]=="S"&&s.charAt(i)=='o')||(sw[i]=="W"&&s.charAt(i)=='x')){
				if(i!=n-1)
					sw[i+1]=sw[i-1];
				if(i==n-1)
					sw[0]=sw[i-1];
			}else{
				if(i!=n-1){
					if(sw[i-1]=="S")sw[i+1]="W";
					if(sw[i-1]=="W")sw[i+1]="S";
				}
				if(i==n-1){
					if(sw[i-1]=="S")sw[0]="W";
					if(sw[i-1]=="W")sw[0]="S";
				}
			}
		}
		}
	}
}