package service.strategy.billAllocationStrategy;

//public class BillCalculationStrategyFactory {
//    public Static BillCalculationStrategy getBill(){
//        return new SimpleBillCalculationStrategy();
//
//    }
//}

public class BillCalculationStrategyFactory {
    public enum BillCalculationType {
        SIMPLE,
        SURGE
    }

    public static BillCalculationStrategy getBill(BillCalculationType type) {
        switch (type) {
            case SIMPLE:
                return new SimpleBillCalculationStrategy();
            case SURGE:
                return new SurgeBillCalculationStrategy();
            default:
                throw new IllegalArgumentException("Unsupported bill calculation type: " + type);
        }
    }
}
