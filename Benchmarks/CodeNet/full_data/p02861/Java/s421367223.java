import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;



public class Main { 
	
	static ArrayList<int[]> arrList =  new ArrayList<int[]>(); 
		
	static HashMap<Integer, int[]> points =  new HashMap<Integer, int[]>();
	
	public static <T> void printAllRecursive(
			  int n, int[] elements) {			 
			    if(n == 1) {
			        printArray(elements);
			    } else {
			        for(int i = 0; i < n-1; i++) {
			            printAllRecursive(n - 1, elements);
			            if(n % 2 == 0) {
			                swap(elements, i, n-1);
			            } else {
			                swap(elements, 0, n-1);
			            }
			        }
			        printAllRecursive(n - 1, elements);
			    }
    }
	
	private static void swap(int[] input, int a, int b) 
    {
	    int tmp = input[a];
	    input[a] = input[b];input[b] = tmp;
	    input[b] = tmp;
	}	
	private static void printArray(int[] input) {
		//creating a new array
		int [] addArray =  new int [input.length];
		for(int index=0; index< input.length; index++) {
			addArray [index] = input[index];
		}
	    arrList.add(addArray);
	}	
	public static void main(String[] args) {		
		Scanner scan =  new Scanner(System.in); 		
		//number of points on the plain
		int numOfPlains =  scan.nextInt();
		int [] pointsIndex =new int[numOfPlains];		
		for(int i=0; i< numOfPlains; i++) {
			pointsIndex[i] = i;
			int [] coord =  new int [2];
			coord [0] = scan.nextInt();
			coord [1] = scan.nextInt();
			points.put(i, coord);
		}	
		printAllRecursive(numOfPlains, pointsIndex);			
		
		double sumOfDistances = 0.0;
		for(int[] path : arrList) {
			for(int i=0; i<path.length-1; i++) {				
					sumOfDistances += (calculateDistance(points.get(path[i]), points.get(path[i+1])));							
			}
		}		
		double avgDistance = sumOfDistances/arrList.size();  
		System.out.println(avgDistance+"");
		
	}
	
	static double calculateDistance(int[] p1, int[] p2) {
		double result=0.0;
		result = Math.sqrt(Math.pow((p2[0]-p1[0]), 2) + Math.pow((p2[1]-p1[1]), 2));		
		return result;
	}
	
}