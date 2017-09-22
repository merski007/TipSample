package tipsample;

public class BaggageServiceTipCalculator implements TipCalculator {
    
    private double baseTip;
    private int bagCount;
    
    public BaggageServiceTipCalculator(int bagCount, double baseTip){
        setBagCount(bagCount);
        setBaseTip(baseTip);
    }
    
    @Override
    public final double produceTip(QualityOfService qos){
        double percent = 0;
        switch(qos){
            case POOR:
                percent = 0.05;
                break;
            case GOOD:
                percent = 0.15;
                break;
            case EXCELLENT:
                percent = 0.20;
                break;
            default:
                percent = 0.0;
        }
        
        return (getBagCount() * getBaseTip()) * (1 + percent);
    }

    public final double getBaseTip() {
        return baseTip;
    }

    public final void setBaseTip(double baseTip) {
        if(baseTip <= 0){
            throw new IllegalArgumentException("Error: baseTip cannot be less then zero.");
        }
        this.baseTip = baseTip;
    }

    public final int getBagCount() {
        return bagCount;
    }

    public final void setBagCount(int bagCount) {
        if(bagCount <= 0){
            throw new IllegalArgumentException("Error: bagCount cannot be less then zero.");
        }
        this.bagCount = bagCount;
    }
    
    
}
