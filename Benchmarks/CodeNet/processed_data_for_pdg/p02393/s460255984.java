public class Main { 
	public static void main(String[] args){
		String str;
                int[] arr = new int[3];
                int i, j, temp;
                Scanner scan = new Scanner(System.in);
                str = scan.next();
                arr[0] = Integer.parseInt(str);
                str = scan.next();
                arr[1] = Integer.parseInt(str);
                str = scan.next();
                arr[2] = Integer.parseInt(str);
                for(i=1; i<3; i++){
                        temp = arr[i];
                        if(arr[i-1] > temp){
                                j = i;
                                do{
                                        arr[j] = arr[j-1];
                                        --j;
                                }while(j > 0 && arr[j-1] > temp);
                                arr[j] = temp;
                        }
                }
                System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
	}
}
