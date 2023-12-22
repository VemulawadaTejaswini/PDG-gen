import java.util.*;
public class Main {
	public static void main(String[] args){
      	//データ取り込み
		Scanner sc = new Scanner(System.in);
      	int cnt = 0;
		int N = sc.nextInt();
      	int monsters[] = new int[N];
      	
      	for(int i=0;i<N;i++){
        	monsters[i] = sc.nextInt();
		}
      	Arrays.sort(monsters);
      	boolean sameflg = true;
      	for(int i=0;i<N-1;i++){
        	if(monsters[i+1]!=monsters[0]){
            	sameflg = false;
                break;
            }
        }
      	if(sameflg){
        	System.out.println(monsters[0]);
        }else{
          	boolean modflg = true;
          	for(int i=0;i<N-1;i++){
            	int mod = monsters[i+1]%monsters[0];
              	if(mod !=0){
                	modflg = false;
                }
            }
          	if(modflg){
            	System.out.println(monsters[0]);
            }else{
              	int min[] = new int[N];
            	for(int j=0;j<N;j++){
                	int arr[] = new int[N];
                  	for(int k=0;k<N;k++){
                    	arr[k] = monsters[j]-(monsters[k]%monsters[j]);
                    }
                  	Arrays.sort(arr);
                  	for(int l=0;l<N;l++){
                    	if(arr[l]!=0){
                        min[j] = arr[l];
                        break;
                        }
                    }	
                }
              	Arrays.sort(min);
              	System.out.println(min[0]);	
            }
        	
        }
    }
}