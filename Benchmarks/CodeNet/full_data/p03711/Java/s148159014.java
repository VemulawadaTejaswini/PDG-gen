public class Hoge{
	public static void main(String[] args){
	
	int x = Integer.parseInt(args[0]);
	int x = Integer.parseInt(args[0]);
	int group1[10] = {1,3,5,7,8,10,12};
	int group2[10] = {4,6,9,11};
	int x_group;
	int y_group;
	
	for(int i=0;i=7;i++){
		if(x == group1[i]){
			x_group = 1;
		}else if(x == group2[i]){
			x_group = 2;
		}else{
			x_group = 3;
		}
	}
	
	for(int i=0;i=7;i++){
		if(y == group1[i]){
			y_group = 1;
		}else if(y == group2[i]){
			y_group = 2;
		}else{
			y_group = 3;
		}
	}
	
	if(x_group == y_group){
		System.out.println("yes");
	}else{
		System.out.println("no");
	}
	
	}
}