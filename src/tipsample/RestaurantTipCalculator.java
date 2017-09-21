package tipsample;

public class RestaurantTipCalculator implements TipCalculator {
    private double billAmt;
    
    public RestaurantTipCalculator(double billAmt){
        this.billAmt = billAmt;
    }
    
    public double produceTip(QualityOfService qos){
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
        
        return billAmt * percent;
    }
}
