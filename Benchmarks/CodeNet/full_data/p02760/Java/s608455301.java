import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.*;
public class Main  
{ 
    public static void main(String[] args) throws IOException  
    { 
        //Enter data using BufferReader 
        BufferedReader reader =  
                   new BufferedReader(new InputStreamReader(System.in)); 
         
      int[][] m = new int[3][3];
        // Reading data using readLine 
      	for (int i = 0;i < 3; ++i) {
         	 String input = reader.readLine(); 
          	String[] vs = input.split(" ");
          	for (int j = 0; j < vs.length; ++j) {
             	m[i][j] =  Integer.valueOf(vs[j]);
            }
        }
      
      	int n = Integer.valueOf(reader.readLine());
        int[] marks = new int[n];
      	for (int i = 0; i < n; ++i) {
          	marks[i] = Integer.valueOf(reader.readLine());
        }
      	
      	Set<Integer> set = new HashSet<>();
      for (int i = 0; i < n; ++i) {
        set.add(marks[i]);
      }
        
      
      	for (int i = 0;i < 3; ++i) {
            int row = 0;
          	for (int j = 0; j < 3; ++j) {
              if (set.contains(m[i][j])) {
                m[i][j] = -1;
                row++;
                if (row == 3) {
                  System.out.println("Yes");
                 	return; 
                }
              }
            }
        }
                  
        for (int i = 0;i < 3; ++i) {
            int col = 0;
          	for (int j = 0; j < 3; ++j) {
              if (m[j][i] == -1) {
                col++;
                if (col == 3) {
                  System.out.println("Yes");
                 	return; 
                }
              }
            }
        }
          
                  int dig = 0;
                  int rDig = 0;
        for (int i = 0; i < 3; ++i) {
        	if (m[i][i] == -1) {
              dig++;
              if (dig == 3) {
                  System.out.println("Yes");
                 	return; 
                }
            }
             
          	if(m[2 - i][i] == -1){
              rDig++;
              if (rDig == 3) {
                  System.out.println("Yes");
                 	return; 
                }
            }
        }
        // Printing the read line 
        System.out.println("No");         
    } 
} 