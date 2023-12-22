import java.util.*;

class Main{
  	public static void main(String args[]){
  		Scanner sc = new Scanner(System.in);
		int n,m;
  		ArrayList<Integer> list = new ArrayList<Integer>();
  		n = sc.nextInt();
  		m = sc.nextInt();
  		boolean hen[][] = new boolean[n][n];
  		for(int i=0;i<m;i++){
    		int a = sc.nextInt();
    	  	int b = sc.nextInt();
    	  	hen[a-1][b-1] = true;
    	}
  		for(int i=0;i<n-1;i++){
    	  	list.add(i);
    		search(i,n,list,i,hen);
    	  	if(list.size()!=0){
    	    	System.out.println(list.size());
    	      	for(int j:list){
    	        	System.out.println(j-1);
    	        }
    	      	System.exit(0);
    	    }
    	}
  		System.out.println(-1);
    }
              
    public static void search(int min,int max,ArrayList<Integer> list,int before,boolean[][]hen){
    	for(int i=min+1;i<max;i++){
        	if(hen[before][i]){
            	for(int j:list){
                	if(j==i){
                    	while(list.get(0)!=j){
                        	list.remove(0);
                        }
                      	return;
                    }
               	}
              	list.add(i);
              	search(min,max,list,i,hen);
              	return;
            }
        }
      	list.clear();
    }
}