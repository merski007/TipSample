package tipsample;

public class RestaurantTipCalculator implements TipCalculator {
    private double billAmt;
    
    public RestaurantTipCalculator(double billAmt){
        setBillAmt(billAmt);
    }
    
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
        
        return getBillAmt() * percent;
    }

    public double getBillAmt() {
        return billAmt;
    }

    public void setBillAmt(double billAmt) {
        if(billAmt <= 0){
            throw new IllegalArgumentException("Error: billAmt cannot be less then zero.");
        }
        this.billAmt = billAmt;
    }
    
    
}
