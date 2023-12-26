public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        String[] array = line.split("");
        int ans = 0;
        for(int i = 0; i < 4; i++){
        	if(array[i].equals("+")){
        		ans++;
        	}else if(array[i].equals("-")){
        		ans--;
        	}
        }
        System.out.println(ans);
	}
}
