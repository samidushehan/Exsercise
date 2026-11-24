public abstract class Delivery {
    private int deliveryId ;
    private String recipientName ;
    private double baseFee ;
    private static int totalDeliveries = 0 ;

    public Delivery(String recipientName , double baseFee){
        totalDeliveries++;
        deliveryId = 1000 + totalDeliveries;

        setRecipientName(recipientName);
        setBaseFee(baseFee);

    }
    public void setRecipientName(String recipientName){
        if (recipientName == null){
            System.out.println("This is invalid Recient Name .");
            this.recipientName = "Invalid Recipient Name";
        }else {
            this.recipientName = recipientName;
        }
    }
    public String getRecipientName(){
        return recipientName;
    }
    public void setBaseFee(double baseFee){
        if ( 0.0 < baseFee){
            this.baseFee = baseFee;
        }else {
            System.out.println("Ivalid Base Fee ");
            this.baseFee = 0.0;
        }
    }
    public double getBaseFee(){
        return baseFee;
    }

    public int getDeliveryId(){
        return deliveryId;
    }
    public static int getTotalDeliveries(){
        return totalDeliveries;
    }
    public abstract double calculateCharge();

    @Override
    public  String toString(){
        return "Delivery ID "+ deliveryId + "Recipient Name "+recipientName + "Base Fee "+baseFee;


    }
}
