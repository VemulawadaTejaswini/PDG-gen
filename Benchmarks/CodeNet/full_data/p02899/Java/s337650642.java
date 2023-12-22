import java.util.*;

class Main{
	public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
      	ArrayList<Num> list = new ArrayList<Num>();
      	int n;
      	n = sc.nextInt();
      	list.add(new Num(1,sc.nextInt()));
      	for(int i=1;i<n;i++){
        	int k = sc.nextInt();
          	int min = 0,max = list.size()-1,b=0;
         	while(min<=max){
            	int mid = (min+max)/2;
              	if(list.get(mid).t>k){
                  	max = mid-1;
                }else{
                  	min = mid+1;
                }
            }
          	list.add(min,new Num(i+1,k));
        }
      	for(int i=0;i<n;i++){
        	System.out.print(list.get(i).n);
          	if(i!=n-1){
            	System.out.print(" ");
            }
        }
      	System.out.println("");
    }
}

class Num{
	int n,t;
  	public Num(int a,int b){
    	n = a; t = b;
    }
}


