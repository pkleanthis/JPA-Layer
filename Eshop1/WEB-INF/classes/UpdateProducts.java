import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import com.tutorialspoint.eclipselink.service.EntityManagerProducts;

public class UpdateProducts {
   public static void main( String[ ] args ) {
      EntityManagerProducts products = Persistence.createEntityManagerProducts( "Eclipselink_JPA" );
      
      EntityManager entitymanager = products.createEntityManager( );
      entitymanager.getTransaction( ).begin( );
      Products Products = entitymanager.find( products.class, 4321 );
      
      //before update
      System.out.println( products );
      products.setSalary( 4321 );
      entitymanager.getTransaction( ).commit( );
      
      //after update
      System.out.println( products );
      entitymanager.close();
      products.close();
   }
}