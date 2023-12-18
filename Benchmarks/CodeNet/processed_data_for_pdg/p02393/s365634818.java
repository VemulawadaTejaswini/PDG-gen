public class Main {
    public static void main(String[] args) throws IOException  {
    	int c;
        int keta = 0;
        int hairetsu_keta[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}; 
        int j = 0;
        int deru = 0;         
        int hairetsu[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int hairetsu_fugou[] = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        int i= 0;
        while ((c = System.in.read()) != -1  )
        {
        	if ( c > 47 && c < 58) 
       	    {
        		hairetsu[i] = c-48;
        		i++;
        		keta++;
       	    }
        	if ( c == 45) 
       	    {
        		hairetsu_fugou[j] = -1;
       	    }  	
        	if ( c == 10) 
        	{
        		hairetsu_keta[j] = keta;
        		deru++; 
        		j++; 
        	}
        	if ( c == 32) 
        	{
        		hairetsu_keta[j] = keta;
        		keta = 0;
        		j++;
        	}
        	if (deru > 0)
        	{
        		break;
            	}
        }
        int hairetsu_suuchi[] = {0,0,0,0,0,0,0,0,0,0};
        int k = 0;
        int m = 0;
        int n = 0;
        while( n < (j + 1))
        {
        while(j > 0 && hairetsu_keta[n] > 0 )
        {
        	hairetsu_suuchi[k] = hairetsu_suuchi[k]*10 + hairetsu[m];
        	hairetsu_keta[n] = hairetsu_keta[n] - 1;
        	m++;
        }
        if (hairetsu_keta[n] == 0)
        {
        	if(hairetsu_fugou[n] == -1)
        	{
        		hairetsu_suuchi[k] = hairetsu_suuchi[k]*(-1);
        	}
        	n++;
        	k++;
        }
        }   	
        int a1;
        if( hairetsu_suuchi[1] > hairetsu_suuchi[2] )
        {
        	a1 = hairetsu_suuchi[1];
        	hairetsu_suuchi[1] = hairetsu_suuchi[2];
        	hairetsu_suuchi[2] = a1;
        }
        if( hairetsu_suuchi[0] > hairetsu_suuchi[1] )
        {
        	a1 = hairetsu_suuchi[0];
        	hairetsu_suuchi[0] = hairetsu_suuchi[1];
        	hairetsu_suuchi[1] = a1;
        }
        if( hairetsu_suuchi[1] > hairetsu_suuchi[2] )
        {
        	a1 = hairetsu_suuchi[1];
        	hairetsu_suuchi[1] = hairetsu_suuchi[2];
        	hairetsu_suuchi[2] = a1;
        }
        {
            System.out.println( hairetsu_suuchi[0] + " " + hairetsu_suuchi[1] + " " + hairetsu_suuchi[2] );     
            }
    }
}
