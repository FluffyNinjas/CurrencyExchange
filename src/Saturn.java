public class Saturn extends Currency{

    public Saturn(double t){
        currencyName = "SaturnSilver";
        totalFunds = t;
    }
    @Override
    public double toEarthDollars(double amount) {
        return(amount/SaturnSilver);
    }

    @Override
    public double fromEarthDollars(double EarthDollars) {
        return(EarthDollars*SaturnSilver);
    }
}
