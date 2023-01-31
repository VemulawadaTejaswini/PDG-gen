//11
public class func{
	public void main(String[] args){
    while ((nr = inputReader.read(buf)) != -1) {
      sb.append(buf, 0, nr);
    }
      mc.process(sb.toString(), inputType, outputType, locale, audioType, defaultVoiceName, defaultStyle, defaultEffects,
          outputTypeParams, System.out);
}
}
