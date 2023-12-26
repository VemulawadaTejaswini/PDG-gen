public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	 String a = sc.nextLine();
     int count = 0;
		for(int i = 0; i < 4; i++){
            String tmp = a.substring(i,i+1);
            if(tmp.equals("+")){
                count++;
            }else{
                count--;
            }
        }
		System.out.println(count);
    }
}
