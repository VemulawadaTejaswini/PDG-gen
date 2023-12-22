import java.util.*;
 class Main {
	
	static class Pair implements Comparable<Pair>{
	    private long x; 
	    private long y; 

	    public Pair(long x, long y) {
	        this.x = x;
	        this.y = y;
	    }

	    public void setFirst(long x) {
	        this.x = x;
	    }

	    public void setSecond(long y) {
	        this.y = y;
	    }

	    public long getx() {
	        return x;
	    }

	    public long gety() {
	        return y;
	    }

		

		@Override
		public int compareTo(Pair o) {
			if(this.getx()>o.getx()){
				return 1;
			}else if(this.getx() == o.getx()){
				return 0;
			}else{
				return -1;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long yMax = 0;
		long x = 0;
		long y = 0;
		int N = sc.nextInt();
		int K = sc.nextInt();
		long [] yPos = new long [N];
		Pair[] pairs = new Pair[N];
		for(int i =0;i<N;i++){
			x = sc.nextLong();
			y = sc.nextLong();
			yPos[i] = y;
			pairs[i]=new Pair(x,y);
		}
		Arrays.sort(pairs);
		Arrays.sort(yPos);
		long xMin = pairs[0].getx();
		long xMax = pairs[N-1].getx();
		
		
		for(Pair temp:pairs){
			
		}
		
		
		
		
		System.out.println((pairs[K-1].getx()-pairs[0].getx())*(yPos[K-1]-yPos[0]));

	}

}
