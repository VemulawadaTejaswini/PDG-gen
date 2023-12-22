import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		String t = in.nextLine();
		int n = in.nextInt();
		
		char []arr = t.toCharArray();
		int index=0;
		
		while(n>0){
			
			while(n>0&&index<t.length()){
				if((26-(arr[index]-'a'))<=n)
				{
					n-=26-(arr[index]-'a');
					arr[index] = 'a';
					
				}
				index++;
			}
			index--;
			while(n>0&&index>-1){
				if(n>25-(arr[index]-'a')){
					n-=25-(arr[index]-'a');
					arr[index] = 'z';
					
				}
				else{
					arr[index] =(char)(arr[index] +n);  
					n=0;
				}
				index--;
			}

			if(index ==-1)
				index = t.length()-1;
		}
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]);
		
		System.out.println();
	}

}
