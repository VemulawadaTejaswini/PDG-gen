public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		double a=sc.nextInt();
		double b=sc.nextInt();
		double h=sc.nextInt();
		double m=sc.nextInt();
		double t=h*60+m;
		double hx = Math.cos(Math.toRadians(t*0.5-90))*a;
		double hy = Math.sin(Math.toRadians(t*0.5-90))*a;
		double mx = Math.cos(Math.toRadians(t*6-90))*b;
		double my = Math.sin(Math.toRadians(t*6-90))*b;
		double d = Math.sqrt((hy-my)*(hy-my)+(hx-mx)*(hx-mx));
		System.out.println(d);
	}
}
