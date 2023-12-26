class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      	int a  = sc.nextInt();
      	int b  = sc.nextInt();
      	double h  = sc.nextDouble();
      	double m  = sc.nextDouble();
      	double hk = ((h / 12) * 360) + ((m / 60) * 30);
      	double mk = 360 * (m / 60);
      	double k = 0;
      	if(mk >= hk){
          k = mk -hk;
        }else{
          k = hk - mk; 
        }
      	if (k>=180){
          k = 360 - k;
        }
      	double cosk = Math.cos(Math.toRadians(k));
       	double c = (a*a) + (b*b) - (2*a*b*cosk);
        System.out.println(Math.sqrt(c));
    }
}
