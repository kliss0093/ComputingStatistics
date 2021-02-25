/**
 * Write a description of class Loan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Loan
{
    // instance variables - replace the example below with your own
    private int ID;
    private double loanAmount;
    private String country;
    private int daysToFund;
    private int numLenders;

    public Loan(int ID, double loanAmount, String country, int daysToFund, 
            int numLenders) {
     this.ID = ID;
     this.loanAmount = loanAmount;
     this.country = country;
     this.daysToFund = daysToFund;
     this.numLenders = numLenders;
    }
    
    public int getID(){
        return ID;
    }
    
    public double getLoanAmount(){
        return loanAmount;
    }
    
    public int getNumLenders(){
        return numLenders;
    }
    
    public String toString(){
        return ID+" "+loanAmount+" "+country+" "+daysToFund+" "+numLenders+" ";
    }
    
    public String getCountry(){
        return country;
    }
    
    public int getDaysToFund(){
        return daysToFund;
    }
    
    public void setID(int ID){
        this.ID = ID;
    }
    
    public void setLoanAmount(double loanAmount){
        this.loanAmount = loanAmount;
    }
    
     public void setCountry(String country){
        this.country = country;
    }
    
    public void setDaysToFund(int daysToFund){
        this.daysToFund = daysToFund;
    }
}
