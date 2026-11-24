public class ExpressDelivery extends Delivery {
        private int distanceKm;
        private double ratePerKm;
        private double priorityFee;

        public ExpressDelivery(String recipientName ,double baseFee , int distanceKm , double ratePerKm , double priorityFee){

            super(recipientName, baseFee);

            setDistanceKm(distanceKm);
            setRatePerKm(ratePerKm);
            setPriorityFee(priorityFee);

        }
        public void setDistanceKm(int distanceKm){
            if (distanceKm > 0 && distanceKm >=500){
                this.distanceKm = distanceKm;
            }else{
                System.out.println("Invalid values");
                this.distanceKm = 0;
            }
        }
        public int getDistanceKm(){
            return distanceKm;
        }
        public void setRatePerKm(double ratePerKm){
            if (ratePerKm < 0.0){
                System.out.println("invalid value");
                this.ratePerKm = 0.0;
            }else{
                this.ratePerKm = ratePerKm;
            }
        }
        public double getRatePerKm(){
            return ratePerKm;
        }
        public void setPriorityFee(double priorityFee){
            if (priorityFee < 0){
                System.out.println("invlid values");
                this.priorityFee = 0.0;
            }else{
                this.priorityFee = priorityFee;
            }
        }
        public double getPriorityFee(){
            return priorityFee;
        }


    @Override
    public double calculateCharge() {
        return getBaseFee() + (distanceKm * ratePerKm) + priorityFee;
    }



    public void schedulePriorityPickup() {

        System.out.println("Priority pickup scheduled for "
                + getRecipientName());
    }

    // Override toString()
    @Override
    public String toString() {

        return super.toString()
                + ", Distance: " + distanceKm + " km"
                + ", Rate Per Km: Rs. " + ratePerKm
                + ", Priority Fee: Rs. " + priorityFee
                + ", Total Charge: Rs. " + calculateCharge();
    }
}
