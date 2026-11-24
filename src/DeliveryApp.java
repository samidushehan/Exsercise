public class DeliveryApp {
    public static void main(String []args){
        System.out.println("===== TASK 2: VALIDATION TEST =====");

        StandardDelivery invalidDelivery = new StandardDelivery("   ", -500, -5.0, -20.0);

        System.out.println(invalidDelivery);

        System.out.println();
        System.out.println("===== TASK 3: VALID DELIVERIES =====");

        StandardDelivery standard1 = new StandardDelivery("Kamal", 200, 5.0, 50.0);

        StandardDelivery standard2 = new StandardDelivery("Nimal", 300, 3.0, 40.0);

        ExpressDelivery express1 = new ExpressDelivery("Amal", 400, 10, 30.0, 100.0);

        ExpressDelivery express2 = new ExpressDelivery("Saman", 500, 20, 25.0, 150.0);

        System.out.println("\n--- Standard Deliveries ---");

        System.out.println(standard1);
        System.out.println(standard2);


        System.out.println("\n--- Express Deliveries ---");

        System.out.println(express1);
        System.out.println(express2);

        System.out.println("\n--- Priority Pickup ---");

        express1.schedulePriorityPickup();
        express2.schedulePriorityPickup();


        System.out.println("\nTotal Deliveries: " + Delivery.getTotalDeliveries());
    }
}