public class Mars extends Currency {
    public Mars(double t){
        currencyName = "MarsMoney";
        totalFunds = t;
    }
    @Override
    public double fromEarthDollars(double EarthDollars) {
        return(EarthDollars*1.3);
    }

    @Override
    public double toEarthDollars(double amount) {
        return(amount/MarsMoney);
    }


}
