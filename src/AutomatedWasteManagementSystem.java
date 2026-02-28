public class AutomatedWasteManagementSystem {
    public static void main(String[] args) {
        
        WasteCollector organic = new OrganicCollector();
        WasteCollector recyclable = new RecyclableCollector();
        WasteCollector hazardous = new HazardousCollector();

        organic.setNextCollector(recyclable);
        recyclable.setNextCollector(hazardous);

        WasteContainer container1 = new WasteContainer("organic", 50);
        WasteContainer container2 = new WasteContainer("recyclable", 30);
        WasteContainer container3 = new WasteContainer("hazardous", 10);
        WasteContainer container4 = new WasteContainer("electronic", 5);

        System.out.println("--- Starting Waste Collection Process ---");
        organic.collect(container1);
        organic.collect(container2);
        organic.collect(container3);
        organic.collect(container4);
    }
}
