public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int result =0;
		String[] fruits = a.split("");
        for (String fruit : fruits) {
                  if(fruit.equals("+")){result++;
}else{
result--;
}
        }
System.out.println(result);
	}
}
