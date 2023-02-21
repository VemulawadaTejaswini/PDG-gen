public class A{
	public Object getStateToBind( Object obj, Name name, Context ctx, Hashtable env)throws NamingException {


		Reference ref=null;
		
		if( obj instanceof Referenceable ) {
			ref=((Referenceable)obj).getReference();
		} else if( obj instanceof Reference ) {
			ref=(Reference)obj;
		} else {
			return null;
		}
		
		String strname;
		
		if( name != null ) {
			strname=java.net.URLEncoder.encode(name.toString().replace('.','^'));
		} else {
			strname="null";
		}
		
		Context name_ctx=ctx.createSubcontext(strname);
		
		ctx.rebind(strname,name_ctx);
		
		String strclass=java.net.URLEncoder.encode(CLASS_TAG+ref.getClassName().replace('.','^'));
		
		
		name_ctx.createSubcontext(strclass);
		
		if( ref.size() > 0 ) {
			for( int i=0 ; i < ref.size() ; i++ ) {
				RefAddr refAddr=ref.get(i);
				String strobj=java.net.URLEncoder.encode((refAddr.getType()+"_"+refAddr.getContent()).replace('.','^'));
				name_ctx.createSubcontext(strobj);
			}
		}
		
		String plainfactory=ref.getFactoryClassName();
		
		String strfactory;
		
		if( plainfactory != null ) {
			strfactory=java.net.URLEncoder.encode(FACTORY_TAG+plainfactory.replace('.','^'));
		} else {
			strfactory=java.net.URLEncoder.encode(FACTORY_TAG+"null");
		}
		name_ctx.createSubcontext(strfactory);
		
		String strlocation=java.net.URLEncoder.encode(LOCATION_TAG+ref.getFactoryClassLocation());
		
		name_ctx.createSubcontext(strlocation);
		
		ctx.unbind(strname);
		
		
		return name_ctx;
		
	}
}