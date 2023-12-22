import javax.swing.JOptionPane; 
public class ReverseString { 
   
  public static void main (String args[]){ 
    String originalString; 
    String resultString = "";   
     
    originalString = JOptionPane.showInputDialog("Please input a String: "); 
     
    char[] charArray = originalString.toCharArray(); 
   
    for (int i=charArray.length-1; i>=0; i--){ 
      resultString += charArray[i]; 
    } 
     
    JOptionPane.showMessageDialog(null, resultString, "Reverse String", JOptionPane.INFORMATION_MESSAGE); 
  } 
}

