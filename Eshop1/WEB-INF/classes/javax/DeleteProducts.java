

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import com.tutorialspoint.eclipselink.service.EntityManagerProducts;
import com.tutorialspoint.eclipselink.service.InsertProducts;

public class DeleteProducts {
   public static void main( String[ ] args ) {
   
      EntityManagerProducts products = Persistence.createEntityManagerProducts( "Eclipselink_JPA" );
      EntityManager entitymanager = products.createEntityManager( );
      entitymanager.getTransaction( ).begin( );
      
      InsertProducts products1 = entitymanager.find( InsertProducts.class, 1201 );
      entitymanager.remove( products1 );
      entitymanager.getTransaction( ).commit( );
      entitymanager.close( );
      products1.close( );
   }
}