import java.util.*;
class Main{
	public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
      	ArrayList<Integer> list = new ArrayList<Integer>();
      	int n = sc.nextInt();
      	int k = sc.nextInt();
      	int x = sc.nextInt();
      	int sum = x;
      	list.add(x);
      	for(int i=0;i<n-1;i++){
        	x = sc.nextInt();
          	sum+=x;
          	int flg = 0;
          	int min = 0,max = list.size()-1;
          	while(min<=max){
            	int mid = (min+max)/2;
              	if(list.get(mid)<x){
                	max = mid-1;
                }else if(list.get(mid)>x){
                	min = mid+1;
                }else{
                	list.add(mid,x);
                  	flg = 2;
                	break;
                }
            }
          	if(flg!=2){
            	list.add(min,x);
            }
        }
      	for(int i=0;i<k;i++){
        	x = list.get(0);
          	if(x==0){break;}
        	sum-=x-x/2;
          	list.remove(0);
          	x = x/2;
          	int flg = 0;
          	int min = 0,max = list.size()-1;
          	while(min<=max){
            	int mid = (min+max)/2;
              	if(list.get(mid)<x){
                	max = mid-1;
                }else if(list.get(mid)>x){
                	min = mid+1;
                }else{
                	list.add(mid,x);
                  	flg = 2;
                	break;
                }
            }
          	if(flg!=2){
            	list.add(min,x);
            }
        }
      	System.out.println(sum);
    }
}