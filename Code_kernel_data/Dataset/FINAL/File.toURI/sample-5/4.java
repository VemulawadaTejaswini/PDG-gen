public class func{
public void getSource(){
            if (problem instanceof DefaultProblem) {
              File f = new File(new String(((DefaultProblem) problem).getOriginatingFileName()));
              if (f.exists()) {
                return new EclipseFileObject(null, f.toURI(), JavaFileObject.Kind.SOURCE, null);
              }
              return null;
            }
}
}
