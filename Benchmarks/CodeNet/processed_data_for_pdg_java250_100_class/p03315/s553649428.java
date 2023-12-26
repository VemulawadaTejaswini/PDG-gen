public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr;
        arr = new String[4];
        String str = sc.nextLine();
        for (int i = 0; i < arr.length; i++) {
        	arr[i] = str.split("")[i];
        }
        int result = 0;
        for (String item : arr) {
        	switch(item) {
        	case "+":
        		result++;
        		break;
        	case "-":
        		result--;
        		break;
        	}
        }
        System.out.println(result);
    }
}
