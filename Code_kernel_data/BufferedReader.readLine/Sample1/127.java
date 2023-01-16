//126
public class func{
	public void loadAffiliationsFromTxt(BufferedReader reader){
        while ((text = reader.readLine()) != null) {
                DocumentAffiliation affiliation = new DocumentAffiliation(text);
                affiliation.setTokens(tokenizer.tokenize(affiliation.getRawText()));
                affiliations.add(affiliation);
        }
}
}
