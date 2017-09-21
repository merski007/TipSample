package tipsample;

public class Startup {
    public static void main(String[] args) {
        //RestaurantTipCalculator  calc = new RestaurantTipCalculator(100.0);
        BaggageServiceTipCalculator calc = new BaggageServiceTipCalculator(2,2);
        
        TipService tipService = new TipService(calc);
        
        //double tip = tipService.produceTip(QualityOfService.POOR);
        //double tip = tipService.produceTip(QualityOfService.GOOD);
        double tip = tipService.produceTip(QualityOfService.EXCELLENT);
        
        System.out.println(tip);
        
    }
}
