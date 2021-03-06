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
    
    //KL
    public int getID(){
        return ID;
    }
    
    //KL
    public double getLoanAmount(){
        return loanAmount;
    }
    
    //HC
    public int getNumLenders(){
        return numLenders;
    }
    
    //HC
    public String toString(){
        return "ID: " +ID+ " loan amount: "+loanAmount+" country: "+country+" days to fund: "+daysToFund+" num lenders "+numLenders;
    }
    
    //AM
    public String getCountry(){
        return country;
    }
    
    //AM
    public int getDaysToFund(){
        return daysToFund;
    }
    
    //KL
    public void setID(int ID){
        this.ID = ID;
    }
    
    //KL
    public void setLoanAmount(double loanAmount){
        this.loanAmount = loanAmount;
    }
    
    //AM
     public void setCountry(String country){
        this.country = country;
    }
    
    //AM
    public void setDaysToFund(int daysToFund){
        this.daysToFund = daysToFund;
    }
    
    //HC
    public void setNumLenders(int numLenders){
        this.numLenders = numLenders;
    }
}
