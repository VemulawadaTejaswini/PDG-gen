import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Main main = new Main();
		main.exec();
		
	}
	
	public void exec() {
		Scanner sc = new Scanner(System.in);
		String[] firstArr = sc.nextLine().split(" ");
		int n = Integer.parseInt(firstArr[0]);
		int m = Integer.parseInt(firstArr[1]);
		ArrayList<Arbeit> arbeitList = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			String[] arbeitStrArr = sc.nextLine().split(" ");
			arbeitList.add(new Arbeit(Integer.parseInt(arbeitStrArr[1]), Integer.parseInt(arbeitStrArr[0])));
		}
		
		sc.close();
		
		Comparator<Arbeit> salaryComparator = Comparator.comparing(Arbeit::getSalary).reversed();
		Comparator<Arbeit> transferDateComparator = Comparator.comparing(Arbeit::getTransferDate).reversed();
		
		arbeitList.sort(transferDateComparator);
		arbeitList.sort(salaryComparator);
		
		int[] summerVacationSche = new int[m+1];
		
		int sumOfSalary = 0;
		
		for(Arbeit arbeit : arbeitList) {
			
			int transferDate = arbeit.getTransferDate();
			int choice = m - transferDate;
			while(choice >= 0 && summerVacationSche[choice] == 1) {
				choice--;
			}
			
			if(choice >= 0) {
				summerVacationSche[choice] = 1;
				sumOfSalary += arbeit.getSalary();
			}
		}
		
		System.out.println(sumOfSalary);
		
	}
	
	public class Arbeit{
		int salary;
		int transferDate;
		
		public Arbeit(int salary, int transferDate){
			this.salary = salary;
			this.transferDate = transferDate;
		}
		
		public int getSalary() {
			return this.salary;
		}
		public int getTransferDate(){
			return this.transferDate;
		}
	}
}
