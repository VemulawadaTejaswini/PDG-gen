public class func{
public void getObject(){
                                while ((len = reader.read(line, 0, 4096)) >= 0)
                                    builder.append(line, 0, len);
                                return builder.toString();
}
}
