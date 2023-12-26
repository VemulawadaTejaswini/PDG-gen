public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
      	int k = sc.nextInt();
      	int q = sc.nextInt();
      	int[] point = new int[n];
        for(int i=0;i<point.length;++i){
            point[i] = k;
        }
      	while(sc.hasNext()){
          int a = sc.nextInt();
          int w = a-1;
          point[w]+=1;
        }
          for(int i=0;i<point.length;++i){
             point[i] -= q;
         	if(point[i]> 0){
            	System.out.println("Yes");
          	}else{
            	System.out.println("No");           
          	}
          }
    }
}
