//44
public class func{
public void parsePhysicalNames(BufferedReader in){
    int nb = Integer.parseInt(in.readLine());
    for(int i = 0; i < nb; i++)
      toReturn[i] = TOKENIZE.split(in.readLine())[2];
}
}
