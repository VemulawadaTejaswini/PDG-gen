//159
public class func{
public void createLemmatizer(){
    Lemmatizer gateLemmatizer = new GateLemmatizer(new File(lemmatizerRulesFileName).toURI().toURL());
    Lemmatizer lemmatizer = new LemmatizerFilterApostrophe(gateLemmatizer);
    lemmatizer.init();
}
}
