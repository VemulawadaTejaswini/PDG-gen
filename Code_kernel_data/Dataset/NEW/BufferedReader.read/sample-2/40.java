//40
public class func{
public void loadModel(Reader inputReader){
                    int ch = reader.read();
                    if (ch == -1) {
                        throw new EOFException("unexpected EOF");
                    }
                    if (ch == ' ') {
                        model.w[i * nr_w + j] = atof(new String(buffer, 0, b));
                        break;
                    } else {
                        buffer[b++] = ch;
                    }
}
}
