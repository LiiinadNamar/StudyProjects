package PjtPawnShop;

import java.util.ArrayList;
import java.util.List;

public class PawnShop {
	private double accountBalance;
    private List<ElectronicDevice> electronicDevices;

    public PawnShop(double accountBalance) {
        this.accountBalance = accountBalance;
        this.electronicDevices = new ArrayList<>();
    }

    public void addDevice(ElectronicDevice device) {
        if (device.getPriceOfPledge() <= accountBalance) {
            electronicDevices.add(device);
            accountBalance -= device.getPriceOfPledge();
        } else {
            System.out.println("Device cannot be added. Insufficient funds in the pawn shop account.");
        }
    }
    
    public double getAccountBalance() {
        return accountBalance;
    }
    
    public void releaseDevice(ElectronicDevice device) {
        device.releaseDevice();
    }

    public void sellDevice(ElectronicDevice device) {
       
    	if (device.isAllowedForSale()) {
            device.sellDevice();
            accountBalance += device.getSellingPrice();
        } else {
            System.out.println("Device cannot be sold. It is not released for sale.");
        }
    }

    public void showAvailableDevices() {
        for (ElectronicDevice device : electronicDevices) {
            if (device.isAllowedForSale() && !device.isSold()) {
                System.out.println(device.getDeviceInfo());
            }
        }
    }
    
    public void showSoldDevices() {
    	for (ElectronicDevice device : electronicDevices) {
    		if (device.isSold()) {
    			System.out.println(device.getDeviceInfo());
    		}
    	}
    }
}