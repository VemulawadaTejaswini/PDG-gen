//5
public class func{
public void start(DataInputStream in,OutputStream out,String[] parameters){
      String line = in.readLine();
      if (line.equals("exit")) break;
        if (line.startsWith("\"")) {
          values[++maxUsed] = line.substring(1);
        } else {
          if (line.indexOf(' ')== -1 && line.indexOf('[') == -1 && line.indexOf('/') == -1) 
            line += "/";
          int pos = line.indexOf('/');
          if (pos != -1) {
            Object obj = values[Integer.parseInt(line.substring(0, pos).trim())];
            if (obj instanceof Object[] && pos == line.length()-1) {
              Object[] arr = (Object[]) obj;
              for (int i = 0; i < arr.length; i++) {
                values[++maxUsed] = arr[i];
              }
            } else {
              Class clazz = obj instanceof Class ? (Class) obj: obj.getClass();
              Method[] mthds = clazz.getMethods();
              for (int i = 0; i < mthds.length; i++) {
                if(mthds[i].getName().startsWith(line.substring(pos+1))) {
                  values[++maxUsed] = mthds[i];
                }
              }
            }
          } else {
            StringTokenizer st = new StringTokenizer(line);
            Object obj = values[Integer.parseInt(st.nextToken())];
            String mthIdx = st.nextToken();
            Object[] args = new Object[st.countTokens()];
            for (int i = 0; i < args.length; i++) {
              args[i] = values[Integer.parseInt(st.nextToken())];
            }
            if (mthIdx.equals("[")) {
              Object[] result = (Object[]) Array.newInstance((Class)obj, args.length);
              System.arraycopy(args, 0, result, 0, args.length);
              values[++maxUsed] = result;
            } else {
              Method mth = (Method) values[Integer.parseInt(mthIdx)];
              values[++maxUsed] = mth.invoke(obj, args);
            }
          }
        }
}
}
