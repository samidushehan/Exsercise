public class StandardDelivery extends Delivery{
    private double weightKG;
    private double ratePerKG;

    public StandardDelivery(String recipientName ,double baseFee ,double weightKG , double ratePerKG){
        super(recipientName,baseFee);

        setWeightKG(weightKG);
        setRatePerKG(ratePerKG);
    }
    public void setWeightKG(double weightKG){
        if (weightKG > 0.0){
            this.weightKG = weightKG;

        }else{
            System.out.println("Invalid values");
        }
    }
    public double getWeightKG(){

        return weightKG;
    }
    public void setRatePerKG(double ratePerKG){
        if (ratePerKG > 0.0){
            this.ratePerKG = ratePerKG;

        }else{
            System.out.println("Invalid values");
        }
    }
    public double getRatePerKG() {
        return ratePerKG;
    }

    public double calculateCharge() {
        return getBaseFee() + (weightKG*ratePerKG);
    }




    @Override
    public String toString(){
        return super.toString()
                + ", weight "+weightKG
                + ", Rate Per Weight "+ratePerKG
                + ", Total charge "+calculateCharge();

    }
}
