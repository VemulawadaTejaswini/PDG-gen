	public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            int c = Integer.parseInt(sc.next());
            int x = Integer.parseInt(sc.next());
            int aa = x/500;
            int counter = 0;
            for(int i=0; i<=Math.min(aa,a); i++){
            	for(int j=0; j<=Math.min((x-i*500)/100, b); j++){
            		if((x - i*500 - j*100)%50 == 0 && (x - i*500 - j*100)/50 <=c){
            			counter++;
            		}
            	}
            }
            System.out.println(counter);
            sc.close();
        }
    }
