//37
public class func{
	public void PdbRdfModel(){
    Date d = new Date();
    date = dateFormat.format(d);
    model.add(dataset, RDF.type, model.createResource("http://rdfs.org/ns/void#Dataset"));
    inDataset = model.createProperty("http://rdfs.org/ns/void#inDataset");
}
}
