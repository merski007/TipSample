package tipsample;

public class BaggageServiceTipCalculator implements TipCalculator {
    
    private double baseTip;
    private int bagCount;
    
    public BaggageServiceTipCalculator(int bagCount, double baseTip){
        this.bagCount = bagCount;
        this.baseTip = baseTip;
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
        
        return (bagCount * baseTip) * (1 + percent);
    }
}
