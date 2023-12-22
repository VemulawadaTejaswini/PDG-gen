/* package codechef; // don't place package name! */
 
import java.util.Scanner;
import java.util.ArrayList;
 
/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sn = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		String str = sn.nextLine();
		String[] s = sn.nextLine().split(" ");
		int[] nums = new int[s.length];
		int[] nextArray;
		int count = 0;
		for(int i = 0;i<nums.length;i++){
		    nums[i] = Integer.parseInt(s[i]);
		}
		
		boolean flag = true;
		if(nums.length == 1) flag = false;
		while(flag){
		    count++;
		    
		    int max = 0;
		    int frontcount = 0;
		    nextArray = new int[nums.length];
		    list = new ArrayList<Integer>();
		    boolean isAscending = true;
		    
		    for(int i = 0;i<nums.length;i++){
		        max = Math.max(max, nums[i]);
		        if(max != nums[i]){         //nums[i]が低い項のとき
		            nextArray[frontcount++] = nums[i];
		            if(nextArray[frontcount-1] > nextArray[frontcount] && frontcount > 0){
		                isAscending = false;
		            }
		        }else{                      //高いとき
		            list.add(new Integer(i));
		        }
		    }
		    int size = list.size();
		    for(int i = 0;i<size;i++){
		        nextArray[frontcount++] = nums[list.get(i)];
		        if(nextArray[frontcount-1] > nextArray[frontcount]){
		                isAscending = false;
		        }
		    }
		    
		    /*nextArrayは昇順か
		    boolean isAscending = true;
		    for(int i = 0;i<nextArray.length-1;i++){
		        if(nextArray[i] > nextArray[i+1]){
		            isAscending = true;
		            break;
		        }
		    }*/
		    if(isAscending){
		        flag = false;
		    }
		    
		    nums = nextArray;
		}
		if(nums.length == 1){
		    System.out.println(0);
		}else{
		System.out.println(count);
		}
	}
}