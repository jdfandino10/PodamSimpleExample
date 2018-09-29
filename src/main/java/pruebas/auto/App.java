package pruebas.auto;

import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

/**
 * Hello world!
 *
 */
public class App {
	
	private static PodamFactory factory;
	
    public static void main( String[] args ) {
    	factory = new PodamFactoryImpl();
    	System.out.println(factory);
    	User u = factory.manufacturePojo(User.class);
    	System.out.println(u);
    	u = factory.manufacturePojo(User.class);
    	System.out.println(u);
    	u = factory.manufacturePojo(User.class);
    	System.out.println(u);
    	u = factory.manufacturePojo(User.class);
    	System.out.println(u);
    	u = factory.manufacturePojo(User.class);
    	System.out.println(u);
    	
    }
    
}
