package tipsample;

public class Startup {
    public static void main(String[] args) {
        //RestaurantTipCalculator  calc = new RestaurantTipCalculator();
        
        //double tip = calc.produceTip(100, QualityOfService.EXCELLENT);
        //System.out.println(tip);
        RestaurantTipCalculator  calc = new RestaurantTipCalculator(100.0);
        
        TipService tipService = new TipService(calc);
        
        double tip = tipService.produceTip(QualityOfService.POOR);
        
        System.out.println(tip);
        
    }
}
