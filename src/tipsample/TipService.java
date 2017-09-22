package tipsample;

public class TipService {
    private TipCalculator tipCalculator;
    
    public TipService(TipCalculator tipCalculator){
        this.tipCalculator = tipCalculator;
    }
    //how would i write a setter method for tipCalculator??
    //would i just check for null?
    //do i need to check for null since it would be impossible to
    //create a TipService object without passing a value?
    
    public final double produceTip(QualityOfService qos){
        return tipCalculator.produceTip(qos);
    }
}
