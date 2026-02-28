class OrganicCollector extends WasteCollector {
    @Override
    public void collect(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("organic")) {
            System.out.println("Organic Collector: Handling " + container.getCapacity() + "kg of organic waste.");
        } else if (nextCollector != null) {
            nextCollector.collect(container);
        }
    }
}

class RecyclableCollector extends WasteCollector {
    @Override
    public void collect(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("recyclable")) {
            System.out.println("Recyclable Collector: Handling " + container.getCapacity() + "kg of recyclable waste.");
        } else if (nextCollector != null) {
            nextCollector.collect(container);
        }
    }
}

class HazardousCollector extends WasteCollector {
    @Override
    public void collect(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("hazardous")) {
            System.out.println("Hazardous Collector: Handling " + container.getCapacity() + "kg of hazardous waste.");
        } else if (nextCollector != null) {
            nextCollector.collect(container);
        } else {
            System.out.println("Error: Waste type '" + container.getType() + "' could not be handled.");
        }
    }
}
