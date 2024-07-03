package PjtPawnShop;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class JUnitTest {

	 @Test
	 public void testPledge() {
	        
	    PawnShop pawnShop = new PawnShop(2000.0);
	    Tablet tablet = new Tablet(123, "Apple", 1000.0, false);
	    MobilePhone phone = new MobilePhone(456, "Samsung", 3000.0, true);
		
	    	pawnShop.addDevice(tablet);//2000-1000=1000
	    	assertEquals(1000.0, pawnShop.getAccountBalance(), 0.01);
	    	
	    	pawnShop.addDevice(phone);
	    	assertEquals(1000.0, pawnShop.getAccountBalance(), 0.01);
	    }

	 @Test
	 public void testSales() {
	     
	    PawnShop pawnShop = new PawnShop(10000.0);
	    Tablet tablet = new Tablet(123, "Apple", 2000.0, false);
	    MobilePhone phone = new MobilePhone(456, "Samsung", 3000.0, true);

	    	pawnShop.addDevice(tablet); //we bought 2 devices, now our balance 5000
	        pawnShop.addDevice(phone);

	        pawnShop.sellDevice(tablet); //we trying sell tablet without releasing, as it not possible balance dont change 
	  		assertEquals(5000.0, pawnShop.getAccountBalance(), 0.01);
	  		
	  		pawnShop.releaseDevice(tablet);//we selling released tablet and our balance increases to 2600 because (2000+2000*0.3)
	        pawnShop.sellDevice(tablet);
	        assertEquals(7600.0, pawnShop.getAccountBalance(), 0.01);
	    }

}
