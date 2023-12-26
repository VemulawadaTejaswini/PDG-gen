class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int i = 0;
		while( sc.hasNext() ){
    		String line[] = sc.nextLine().split(" ");
			arr[i] = Integer.parseInt(line[0]);
			i++;
		}
		Arrays.sort(arr);
    	System.out.println(arr[9]);
    	System.out.println(arr[8]);
    	System.out.println(arr[7]);
	}
}
