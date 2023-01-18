//27
public class func{
	public void locateParserClass(GrammarInfo grammarInfo,ClassLoader classLoader){
        String parserClassName = grammarInfo.getGrammarName() + "Parser";
        if ( grammarInfo.getGrammarPackage() != null ) {
            parserClassName = grammarInfo.getGrammarPackage()+ "." + parserClassName;
        }
        return classLoader.loadClass( parserClassName );
}
}
