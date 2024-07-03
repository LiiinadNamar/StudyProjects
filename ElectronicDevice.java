package PjtPawnShop;

abstract class ElectronicDevice { // attributes of all electronic devices
    protected int IMEI;
    protected String manufacturer;
    protected double priceOfPledge;
    protected double sellingPrice;
    protected boolean allowedForSale;
    protected boolean sold;

    public ElectronicDevice(int IMEI, String manufacturer, double priceOfPledge) {
        this.IMEI = IMEI;
        this.manufacturer = manufacturer;
        this.priceOfPledge = priceOfPledge;
        this.sellingPrice = 6666 ;
        this.allowedForSale = false;
        this.sold = false;
    }

    public abstract void calculateSellingPrice();
    

    public int getIMEI() {
        return IMEI;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getPriceOfPledge() {
        return priceOfPledge;
    }

    public double getSellingPrice() {
    	//calculateSellingPrice(); 
        return sellingPrice;
    }

    public boolean isAllowedForSale() {
        return allowedForSale;
    }

    public boolean isSold() {
        return sold;
    }

    public void pledgeDevice() {
        allowedForSale = false;
    }

   
    public boolean releaseDevice() {
       allowedForSale = true;
       return allowedForSale;
    }


    
    public void sellDevice() {
        if (allowedForSale && !sold) {
            sold = true;
        }
    }

    public abstract String getDeviceInfo();
}
