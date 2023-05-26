//69
public class func{
public void main(String[] args){
    BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
    for(String line; (line = is.readLine()) != null; ){
      Annotation ann = pipeline.process(line, null, timeAnnotator);
      System.out.println(ann.get(TimeAnnotations.TimexAnnotations.class));
      System.out.print("> ");
    }
}
}
