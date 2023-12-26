public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a == 1){
		    System.out.println("Yes");
		}
		else
		{
		    int grid[] = new int[a];
    		for(int i = 0; i < a; i++){
    		    grid[i] = sc.nextInt();
    		}
    		for(int i = 0; i < a; i++){
    		    if(i == 0){
    		        if(grid[0] > grid[1] && grid[0] > 1){
    		            grid[0]--;
    		        }
    		    }
    		    else
    		    {
    		        if(grid[i] > grid[i-1] && grid[i] > 1){
    		            grid[i]--;
    		        }
    		    }
    		}
    		boolean flg = true;
    		for(int i = 0; i < a; i++){
    		    if(i == 0){
    		        if(grid[0] > grid[1]){
    		            flg = false;
    		            break;
    		        }
    		    }
    		    else
    		    {
    		        if(grid[i] < grid[i-1]){
    		            flg = false;
    		            break;
    		        }
    		    }
    		}
    		if(flg == true){
    		    System.out.println("Yes");
    		}
    		else
    		{
    		    System.out.println("No");
    		}
		}
	}
}
