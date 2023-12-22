import java.util.*;
 
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
	List<Integer> listT = new ArrayList<Integer>();
	List<Integer> listX = new ArrayList<Integer>();
	List<Integer> listY = new ArrayList<Integer>();
	while(sc.hasNext()){
		listT.add(sc.nextInt());
		listX.add(sc.nextInt());
		listY.add(sc.nextInt());
	}
	//経過時間
	int dt = listT.get(0);
	//移動距離
	int dist = listX.get(0) + listY.get(0);
	
	if(dist > dt){System.out.println("No");}
	
	for(int i = 0; i <= n-2; i++){
		dt = listT.get(i+1) - listT.get(i);
		dist = listX.get(i+1) - listX.get(i) 
			+ listY.get(i+1) - listY.get(i);
		if((dt%2!=0 && dist%2==0) || (dt%2==0 && dist%2!=0)){
			System.out.println("No");
			break;
		}
		if(i==n-2){
          if((dt%2==0 && dist%2==0) || (dt%2!=0 && dist%2!=0)){
			System.out.println("Yes");
          }
		}
	}
  }
}