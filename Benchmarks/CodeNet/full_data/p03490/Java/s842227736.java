
import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args){
		solve();
	}
	public static void solve(){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int x = sc.nextInt()+5000;
		int y = sc.nextInt()+5000;
		int[] xdp = new int[10000];
		int[] ydp = new int[10000];
		int xnow = 1;
		int ynow = 1;
		xdp[5000] = 1;
		ydp[5000] = 1;
		boolean flag = true;
		boolean judge = true;
		int count = 0;
		for(int j=0;j<s.length();j++){
			if(s.charAt(j)=='F'){
				count++;
			}
			else{
				if(count!=0){
						if(flag){
							if(judge){
								for(int i=0;i<10000;i++){
									if(xdp[i] == xnow){
										xdp[i+count] = xnow + 1;
									}
								}
							}
							else{
								for(int i=0;i<10000;i++){
									if(xdp[i] == xnow){
										xdp[i+count] = xnow + 1;
										xdp[i-count] = xnow + 1;

									}
								}
							}
							xnow++;
						}
						else{
							for(int i=0;i<10000;i++){
								if(ydp[i] == ynow){
									ydp[i+count] = ynow + 1;
									ydp[i-count] = ynow + 1;
								}
							}
							ynow++;
						}
				}
				flag = !flag;
				judge = false;
				count = 0;
			}
		}

		if(count!=0){
		 	if(flag){
				if(judge){
					for(int i=0;i<10000;i++){
						if(xdp[i] == xnow){
							xdp[i+count] = xnow + 1;
						}
					}
				}
				else{
					for(int i=0;i<10000;i++){
						if(xdp[i] == xnow){
							xdp[i+count] = xnow + 1;
							xdp[i-count] = xnow + 1;
						}
					}
				}
				xnow++;
			}
			else{
				for(int i=0;i<10000;i++){
					if(ydp[i] == ynow){
						ydp[i+count] = ynow + 1;
						ydp[i-count] = ynow + 1;
					}
				}
				ynow++;
			}
		}


		if(xdp[x] == xnow && ydp[y] == ynow){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}
