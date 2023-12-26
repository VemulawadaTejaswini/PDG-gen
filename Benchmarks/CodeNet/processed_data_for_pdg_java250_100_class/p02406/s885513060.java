public class Main {
	public static void main(String[] args) throws Exception {
		try{
	BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    String input = buf.readLine();
int max = Integer.parseInt(input);
int x;
for(int i =3; i <= max; i++){
    x = i;
	if(i%3 == 0){
		System.out.printf(" " + i);
	}else{
	while(x > 1){
		if(x%10 == 3){
		System.out.printf(" " + i);
		break;
	}
		x = x / 10;
	}
	}
}
System.out.printf("\n");
} catch (Exception e) {
	System.out.println("????????????");
}
		 }
    }
