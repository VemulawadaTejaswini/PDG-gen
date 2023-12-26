public class Main {
    public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(true){
			int tyuukan = scan.nextInt();
			int kimatu = scan.nextInt();
			int tuishi = scan.nextInt();
			if(tyuukan == -1 && kimatu == -1 && tuishi == -1)
				break;
			else if(tyuukan == -1 || kimatu == -1)
					System.out.println("F");
			else if(tyuukan + kimatu >= 80)
				System.out.println("A");
			else if(tyuukan + kimatu >= 65)
				System.out.println("B");
			else if(tyuukan + kimatu >= 50)
				System.out.println("C");
			else if(tyuukan + kimatu >= 30)
				if(tuishi >= 50)
					System.out.println("C");
				else
					System.out.println("D");
			else
				System.out.println("F");
		}
		scan.close();
	}
}
