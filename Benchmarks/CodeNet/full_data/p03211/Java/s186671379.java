import java.util.Scanner;

class Main{
	public static void main (String args[]){
		Scanner Scanner = new Scanner(System.in);
		String  X = Scanner.nextLine();
		int champion = 0;
		int chalenger;
		for(int i = 0; i < X.length()-2; i++){
			if(i==0) {
              champion = Math.abs(Integer.parseInt(X.substring(i, i + 3)) - 753);
              continue;
            }else{
              chalenger = Math.abs(Integer.parseInt(X.substring(i, i + 3)) - 753);
              if(champion < chalenger)  champion = chalenger;
            }
        }
        
		System.out.println(Integer.toString(champion));
	}

}