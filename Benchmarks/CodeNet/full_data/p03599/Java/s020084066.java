package abc074;

public class Main{
 public static void main(String[] args){
  Scanner scanner=new Scanner(System.in);
  int a=scanner.nextInt();
  int b=scanner.nextInt();
  int c=scanner.nextInt();
  int d=scanner.nextInt();
  int e=scanner.nextInt();
  int f=scanner.nextInt();
  scanner.close();
  double concentration=0;
  int total=0;
  int sugar=0;
  for(int na=0;a*na*100<f;na++)
   for(int nb=0;a*na*100+b*nb*100<f;nb++)
    for(int nc=0;a*na*100+b*nb*100+c*nc<f;nc++)
     for(int nd=0;a*na*100+b*nb*100+c*nc+d*nd<f;nd++)
      if(c*nc+d*nd<=e*(a*na+b*nb)) if((double)(c*nc+d*nd)/(double)(a*na*100+b*nb*100+c*nc+d*nd)>concentration){
       concentration=(double)(c*nc+d*nd)/(double)(a*na*100+b*nb*100+c*nc+d*nd);
       total=a*na*100+b*nb*100+c*nc+d*nd;
       sugar=c*nc+d*nd;
       System.out.println(na+" "+nb+" "+nc+" "+nd);
      }
  System.out.println(total+" "+sugar);
 }
}
