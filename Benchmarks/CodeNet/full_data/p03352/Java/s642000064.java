import java.util.Scanner;

class Main{

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int data[] = new int[x/2];
		int i= 2;
		int count = 0;
		
		if(x == 1){
			System.out.println(x);
		}else{

			while(i < data.length){
				int z = i;
				while(z <= x){
					z *= i;

				}
				z /= i;
				data[count] = z;
				i++;
				count++;
			}
			int max = 0;
			for(int j = 0;j < data.length;j++){
				max = Math.max(max, data[j]);	
			}

			System.out.println(max);




		}
	}





}




