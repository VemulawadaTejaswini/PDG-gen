import java.io.*;
import java.util.*;

class Main {
 	public static void main(String arhgs[]) throws IOException {
     	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      	StringTokenizer st = new StringTokenizer(br.readLine());
      	int N = Integer.parseInt(st.nextToken());
      	int M = Integer.parseInt(st.nextToken());
      	st = new StringTokenizer(br.readLine());
      	int[] arr = new int[N];
      	int i = 0;
      	while(st.hasMoreTokens()) {
         	 arr[i++] = Integer.parseInt(st.nextToken());
        }
      	Pair[] pairs = new Pair[M];
      	for(int j=0;j<M;j++) {
         	st = new StringTokenizer(br.readLine());
          	Pair p = new Pair();
          	p.setKey(Integer.parseInt(st.nextToken()));
          	p.setValue(Integer.parseInt(st.nextToken()));
          	pairs[j] = p;
        }
      	Arrays.sort(arr);
      	Arrays.sort(pairs);
      	long ans = 0;
      	for(int m=0,n=0;m<arr.length && n<pairs.length ; m++) {
         	Pair pp = pairs[n];
          	int count = pp.getKey();
          	int value = pp.getValue();
          	if(arr[m] < value) {
              if(count > 0) {
				ans += value;
                count--;
                pp.setKey(count);
                pairs[n] = pp;
              } else {
                n++;
                m--;
              }
            }  else {
              ans += arr[m];
            }
        }
      	System.out.println(ans);
    }
}
          
class Pair implements Comparable<Pair>{
 	int key;
  	int value;
  	public void setKey(int key) {
     	this.key = key; 
    }
  	public void setValue(int value) {
     	this.value = value; 
    }
  	public int getKey() {
     	return this.key; 
    }
  	public int getValue() {
     	return this.value; 
    }
  	
  	public int compareTo(Pair pp) {
     	 return Integer.compare(pp.getValue(), this.value);
    }
}