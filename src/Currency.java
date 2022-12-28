import java.text.DecimalFormat;

public abstract class Currency implements Exchangable{
    public String currencyName;
    public double totalFunds;






    public abstract double toEarthDollars(double amount);
    public abstract double fromEarthDollars(double EarthDollars);

    @Override
    public void exchange(Currency other, double amount) {
        if(this.totalFunds<amount){
            DecimalFormat df = new DecimalFormat("###.##");

            System.out.println("Uh oh - "+this.getClass().getSimpleName()+" only has an available balance of $"+df.format(this.totalFunds)+", which is less than $"+amount);
            System.out.println(" ");
        }
        else{
            this.totalFunds-=amount;
            System.out.println("Converting from "+this.currencyName +" to "+other.currencyName+" and initiating transfer. . .");
            double x = this.toEarthDollars(amount);
            double y = other.fromEarthDollars(x);
            DecimalFormat df = new DecimalFormat("###.##");
            other.totalFunds+=y;
            System.out.println("$"+df.format(amount)+" "+this.currencyName+" = $"+df.format(x)+" EarthDollars = "+df.format(y)+" "+other.currencyName);
            System.out.println(this.getClass().getSimpleName()+" has a total of $"+df.format(this.totalFunds)+" "+this.currencyName);
            System.out.println(other.getClass().getSimpleName()+" has a total of $"+df.format(other.totalFunds)+" "+other.currencyName);
            System.out.println("");
            System.out.println("raa");

        }



    }

    public static void main(String[] args) {
        Currency mars = new Mars(100.00);
        Currency neptune = new Neptune(100.00);
        Currency saturn = new Saturn(100.00);
        System.out.println("<-- Exchanges -->");
        mars.exchange(saturn, 25.0);
        neptune.exchange(saturn, 10.0);
        saturn.exchange(mars, 122.0);
        saturn.exchange(mars, 121.0);

    }
}
