package PjtPawnShop;

public class Project {
	public static void main(String[] args) {
        PawnShop pawnShop = new PawnShop(1000.0);//bank acc balance

        //phone&laps &info
        MobilePhone mobilePhone = new MobilePhone(12345, "Samsung", 200.0, false);
        Tablet tablet = new Tablet(67890, "Apple", 160.0, true);

        pawnShop.addDevice(mobilePhone);
        pawnShop.addDevice(tablet);

        pawnShop.releaseDevice(mobilePhone);
        pawnShop.releaseDevice(tablet);

        pawnShop.sellDevice(mobilePhone);
        pawnShop.sellDevice(tablet);
 
        System.out.println("Available Devices:");
        pawnShop.showAvailableDevices();

        System.out.println("\nSold Devices:");
        pawnShop.showSoldDevices();
        
        
    }
}
