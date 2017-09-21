package tipsample;

public class TipService {
    private TipCalculator tipCalculator;
    
    public TipService(TipCalculator tipCalculator){
        this.tipCalculator = tipCalculator;
    }
    
    public final double produceTip(QualityOfService qos){
        return tipCalculator.produceTip(qos);
    }
}
