
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
    //HC
    public String toString(){
        return ID+" "+loanAmount+" "+country+" "+daysToFund+" "+numLenders+" ";
    }
    //HC
    public String getCountry(){
        return country;
    }
    
    public int getDaysToFund(){
        return daysToFund;
    }
    
     public void setCountry(String newCountry){
        country = newCountry;
    }
    
    public void setDaysToFund(int newFund){
        daysToFund = newFund;
    }
    
    public void setNumLenders(int newnumLenders){
        numLenders = newnumLenders;
    }
    //HC
}
