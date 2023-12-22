import java.util.Scanner;
public class Main {
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int[]a = new int[3];
    int[]b = new int[3];
    int[]c = new int[3];

    for(int i=0; i<3; i++) {
    	a[i] = sc.nextInt();
    }
    for(int i=0; i<3; i++) {
    	b[i] = sc.nextInt();
    }
    for(int i=0; i<3; i++) {
    	c[i] = sc.nextInt();
    }
    int n = sc.nextInt();
    int[]d = new int[n];
    
    int coua = 0;
    int coub = 0;
    int couc = 0;
    int cou1 = 0;
    int cou2 = 0;
    int cou3 = 0;
    int coue = 0;
    int couf = 0;
  
     for(int i=0; i<n; i++) {
    	d[i] = sc.nextInt();
    	if(d[i]==a[0]){
    		coua++; cou1++; coue++;
    	}else if(d[i]==a[1]) {
    		coua++; cou2++; coue++; couf++;
    	}else if(d[i]==a[2]) {
    		coua++; cou3++; couf++;
    	}else if(d[i]==b[0]) {
    		coub++; cou1++;
    	}else if(d[i]==b[1]) {
        	coub++; cou2++; coue++; couf++;
    	}else if(d[i]==b[2]) {
        	coub++; cou3++;
    	}else if(d[i]==c[0]) {
        	couc++; cou1++; couf++;
        }else if(d[i]==c[1]) {
        	couc++; cou2++; coue++; couf++;
        }else if(d[i]==c[2]) {
        	couc++; cou3++; coue++;   
     	}
    }
    	if(coua==3 || coub==3 || couc==3 || cou1==3 || cou2==3 || cou3==3 || coue==3 || couf==3) {
    	System.out.println("Yes");
    	}else {
    	System.out.println("No");
    }
      }
}