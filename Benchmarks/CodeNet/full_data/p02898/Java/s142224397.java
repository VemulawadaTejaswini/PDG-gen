import java.util.*; 
class RollerCoaster{
	public static void main(String arg[]) {
    	Scanner input = new Scanner(System.in);
        int count = 0;
        int num = input.nextInt();
        int height = input.nextInt();
        for(int i = 0; i<num; i++) {
        	int allowHeight = input.nextInt();
            if(allowHeight >= height)
            	count++;
        }
        System.out.println(count);
    }
}