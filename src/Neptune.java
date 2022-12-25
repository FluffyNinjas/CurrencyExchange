public class Neptune extends Currency{

    public Neptune(double t){
        currencyName = "NeptuneNuggets";
        totalFunds = t;
    }
    @Override
    public double toEarthDollars(double amount) {
        return(amount/NeptuneNuggets);
    }

    @Override
    public double fromEarthDollars(double EarthDollars) {
        return(EarthDollars*NeptuneNuggets);
    }
}
