public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str;
			String[] arr;
			int i;
			int j;
			while((str = br.readLine()) !=  null){
				arr = str.split(" ");
				i = Integer.parseInt(arr[0]);
				j = Integer.parseInt(arr[1]);
				if(i == 0 && j == 0) {
					break;
				}
				if(i <= j) System.out.println(str);
				else {
					System.out.println(arr[1] + " " + arr[0]);
				}
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
