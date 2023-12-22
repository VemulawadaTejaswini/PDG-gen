

import java.util.LinkedList;

import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    String S = sc.next();
	    sc.close();
	    
	    Queue <Character> Left = new LinkedList <Character>();
	    Queue <Character> Right = new LinkedList <Character>();
	    int length = S.length();
	    
	    for (int i=0; i<length; i++){
	    	Left.add(S.charAt(i));
	    	Right.add(S.charAt(length-i-1));
	    }
	    
	    int lc = 0;
	    while (Left.isEmpty()!=true){
	    	lc = Solve_L(Left,lc);
	    }
	    //System.out.println(lc);
	    
	    int rc = 0;
	    while (Right.isEmpty()!=true){
	    	rc = Solve_R(Right,rc);
	    }
	    //System.out.println(rc);
	    if (lc+rc<7)
	    	System.out.println("NO");
	    else
	    	System.out.println("YES");
	    
	}

	    public static int Solve_L (Queue <Character> Left, int lc){
	    	int temp = 0;
	    	char next = Left.poll();
	    
	    	while (Left.isEmpty()!=true && next!='k'){
	    		next = Left.poll();
	    	}
	    	
	    	if (Left.isEmpty()){
	    		lc = Math.max(lc, temp);
	    		return lc;
	    	}
	    	
	    	else {
	    		temp++;
	    		//System.out.println("k");
	    		if (Left.isEmpty()){
	    			lc = Math.max(lc, temp);
		    		return lc;
		    	}
	    		
	    		next = Left.peek();
	    		
	    		if (next!='e'){
	    			lc = Math.max(lc, temp);
	    			return lc;
	    		}	
	    		
	    		else {
	    			Left.poll();
	    			temp++;
	    			//System.out.println("e");
	    			if (Left.isEmpty()){
	    				lc = Math.max(lc, temp);
	    	    		return lc;
	    	    	}
	    			
	    			next = Left.peek();
	    			
	    			if (next!='y'){
	    				lc = Math.max(lc, temp);
			    		return lc;
	    			}
	    		
	    			else {
	    				Left.poll();
	    				temp++;
	    				//System.out.println("y");
	    				if (Left.isEmpty()){
	    					lc = Math.max(lc, temp);
	    		    		return lc;
	    		    	}
	    				
	    				next = Left.peek();
	    				
	    				if (next!='e'){
	    					lc = Math.max(lc, temp);
				    		return lc;
	    				}
		
	    				
	    				else {
	    					Left.poll();
	    					temp++;
	    					//System.out.println("e");
	    					if (Left.isEmpty()){
		    					lc = Math.max(lc, temp);
		    		    		return lc;
		    		    	}
	    					
	    					
	    					next = Left.peek();
	    					
	    					if (next!='n'){
	    						lc = Math.max(lc, temp);
					    		return lc;
	    					}
	    
	    					else {
	    						Left.poll();
	    						temp++;
	    						//System.out.println("n");
	    						if (Left.isEmpty()){
	    							lc = Math.max(lc, temp);
	    				    		return lc;
	    				    	}
	  
	    						next = Left.peek();
	    					
	    						if (next!='c'){
	    							lc = Math.max(lc, temp);
						    		return lc;
	    						}
	    							
	    						else {
	    							Left.poll();
	    							temp++;
	    							//System.out.println("c");
	    							if (Left.isEmpty()){
	    								lc = Math.max(lc, temp);
	    					    		return lc;
	    					    	}
	    							next = Left.peek();
	    							
	    							if (next!='e'){
	    								lc = Math.max(lc, temp);
							    		return lc;
	    							}
	    							
	    							
	    							else {
	    								Left.poll();
	    								temp++;
	    								//System.out.println("e");
	    								lc = Math.max(lc, temp);
							    		return lc;
							    		
	    							}
	    						}
	    					}
	    				}
	    			}
	    		}
	    	}
	    }

	    public static int Solve_R (Queue <Character> Right, int rc){
	    	int temp = 0;
	    	char next = Right.poll();
	    
	    	while (Right.isEmpty()!=true && next!='e'){
	    		next = Right.poll();
	    	}
	    	
	    	if (Right.isEmpty()){
	    		rc = Math.max(rc, temp);
	    		return rc;
	    	}
	    	
	    	else {
	    		temp++;
	    	
	    		if (Right.isEmpty()){
	    			rc = Math.max(rc, temp);
		    		return rc;
		    	}
	    		
	    		next = Right.peek();
	    		
	    		if (next!='c'){
	    			rc = Math.max(rc, temp);
	    			return rc;
	    		}	
	    		
	    		else {
	    			Right.poll();
	    			temp++;
	    			
	    			if (Right.isEmpty()){
	    				rc = Math.max(rc, temp);
	    	    		return rc;
	    	    	}
	    			
	    			next = Right.peek();
	    			
	    			if (next!='n'){
	    				rc = Math.max(rc, temp);
			    		return rc;
	    			}
	    		
	    			else {
	    				Right.poll();
	    				temp++;
	    				
	    				if (Right.isEmpty()){
	    					rc = Math.max(rc, temp);
	    		    		return rc;
	    		    	}
	    				
	    				next = Right.peek();
	    				
	    				if (next!='e'){
	    					rc = Math.max(rc, temp);
				    		return rc;
	    				}
		
	    				
	    				else {
	    					Right.poll();
	    					temp++;
	    					
	    					if (Right.isEmpty()){
		    					rc = Math.max(rc, temp);
		    		    		return rc;
		    		    	}
	    					
	    					
	    					next = Right.peek();
	    					
	    					if (next!='y'){
	    						rc = Math.max(rc, temp);
					    		return rc;
	    					}
	    
	    					else {
	    						Right.poll();
	    						temp++;
	    						
	    						if (Right.isEmpty()){
	    							rc = Math.max(rc, temp);
	    				    		return rc;
	    				    	}
	  
	    						next = Right.peek();
	    					
	    						if (next!='e'){
	    							rc = Math.max(rc, temp);
						    		return rc;
	    						}
	    							
	    						else {
	    							Right.poll();
	    							temp++;
	    							
	    							if (Right.isEmpty()){
	    								rc = Math.max(rc, temp);
	    					    		return rc;
	    					    	}
	    							next = Right.peek();
	    							
	    							if (next!='k'){
	    								rc = Math.max(rc, temp);
							    		return rc;
	    							}
	    							
	    							
	    							else {
	    								Right.poll();
	    								temp++;
	    						
	    								rc = Math.max(rc, temp);
							    		return rc;
							    		
	    							}
	    						}
	    					}
	    				}
	    			}
	    		}
	    	}
	    }
}


	  				
	  			
	    		
	    	
	    


	    

	

