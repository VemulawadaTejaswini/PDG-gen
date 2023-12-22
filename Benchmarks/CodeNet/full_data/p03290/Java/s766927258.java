import java.util.Scanner;

class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    
    int d = Integer.parseInt(sc.next());
    int g = Integer.parseInt(sc.next());
    int[] p = new int[d];
    int[] c = new int[d];
    int[] total = new int[d];
    int count,mid,maxIdx,lb = 0,ub =0;
    double maxVal;
    for(int i=0;i<d;i++){
      p[i] = Integer.parseInt(sc.next());
      c[i] = Integer.parseInt(sc.next());
      total[i] = 100*(i+1)*p[i] + c[i];
      ub+=p[i];
    }
    double[] virtual = new double[d];
    int[] p_count = new int[d];
    int sum = 0;
    
    while(ub-lb >1){
      mid = (lb+ub)/2;
      count = mid;
      sum = 0;
      for(int i=0;i<d;i++)p_count[i] = p[i];
      while(count > 0){
        maxVal = maxIdx = 0;
        for(int i=0;i<d;i++){
          if(p_count[i] == 0){
            virtual[i] = 0.0;
          }else if(count < p_count[i]){
            virtual[i] = 100.0*(i+1);
          }else{
            virtual[i] = (double)total[i]/p_count[i];
          }
        }
        for(int i=0;i<d;i++){
          if(virtual[i] > maxVal){
            maxVal = virtual[i];
            maxIdx = i;
          }
        }
        if(count < p_count[maxIdx]){
          sum+=100*(maxIdx+1)*count;
        }else{
          sum+=total[maxIdx];
        }
        count-=p_count[maxIdx];
        p_count[maxIdx] = 0;
      }
      if(sum >= g){
        ub = mid;
      }else{
        lb = mid;
      }
    }
    System.out.print(ub);
    System.out.flush();
    
  }
}