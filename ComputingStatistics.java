import java.util.ArrayList;



public class ComputingStatistics {
   /**
   * The ArrayList containing all of the loan data.
   */
   private ArrayList<Loan> data;
   
   /**
    * Creates a new ComputingStatistics object with an empty ArrayList 
    */
   public ComputingStatistics() {
      data = new ArrayList<Loan>();
   }
   
   /**
    * Creates a new ComputingStatistics object with the data passed in
    */
   public ComputingStatistics(ArrayList<Loan> d) {
      data = d;
   }
   
   /**
    * Calclates the total amount funded from all of the loans in the file.
    * @return the total loan amount.
    */
   public double totalAmount() {
      double amount = 0.0;
      Loan loan;
      for(int i = 0; i < data.size(); i++) {
         loan = data.get(i);
         amount = amount + loan.getLoanAmount();
      }
      return amount;
   }
   
   //AM
   public double avgLoan() {
      double amount = 0.0;
      Loan loan;
      for(int i = 0; i < data.size(); i++) {
         loan = data.get(i);
         amount = amount + loan.getLoanAmount();
      }
      return amount / data.size();
   }
   
   //AM
   public double avgLoan(String countryNm) {
      double amount = 0.0;
      int cycles = 0;
      Loan loan;
      for(int i = 0; i < data.size(); i++) {
         loan = data.get(i);
         if (loan.getCountry().equals(countryNm)){
             amount = amount + loan.getLoanAmount();
             cycles+=1;
        }
      }
      return amount / cycles;
   }
   
   //AM
   public double largestLoan() {
      double amount = 0.0;
      Loan loan;
      for(int i = 0; i < data.size(); i++) {
         loan = data.get(i);
         if (amount < loan.getLoanAmount()) amount = loan.getLoanAmount();
      }
      return amount;
   }
   
   //KL
   public double smallestLoan(){
       double amount = Integer.MAX_VALUE;
       Loan loan;
       for(int i = 0; i < data.size(); i++) {
           loan = data.get(i);
           if(amount > loan.getLoanAmount()) {
               amount = loan.getLoanAmount();
           }
       }
       return amount;
   }
   
   //HC
    public String largestLoanCountry()
      {
          Loan loan;
      String country = "";
      double max = 0;
      double bigger = 0;
      double lesser = 0;
      for (int i=1 ; i < data.size(); i++)
      { 
          loan = data.get(i);
          bigger = loan.getLoanAmount();
          lesser = loan.getLoanAmount();
          
        if(lesser> max)
        {
            max = lesser;
            country = loan.getCountry();
        

      }
      else if(bigger>max)
      {
          max=loan.getLoanAmount();
          country = loan.getCountry();
        }
    }

        return country;
    }
    //HC
    public String smallestLoanCountry()
    {
     Loan loan;
      String country = "";
      double min = 10000.0;
      double bigger = 0;
      double lesser = 0;
      for (int i=0 ; i < data.size(); i++)
      { 
          loan = data.get(i);
          bigger = loan.getLoanAmount();
          lesser = loan.getLoanAmount();
          
        if(lesser<min)
        {
            min = lesser;
            country = loan.getCountry();
        

      }
      else if(bigger<min)
      {
          min=loan.getLoanAmount();
          country = loan.getCountry();
        }

    }
    return country;
  }
  //HC
  public String longestToFundCountry()
   
  {
     Loan loan;
      String country = "";
      double max = 0.0;
      double bigger = 0;
      double lesser = 0;
      for (int i=0 ; i < data.size(); i++)
      { 
          loan = data.get(i);
          bigger = loan.getDaysToFund();
          lesser = loan.getDaysToFund();
          
        if(lesser>max)
        {
            max = lesser;
            country = loan.getCountry();
        

      }
      else if(bigger>max)
      {
          max=loan.getDaysToFund();
          country = loan.getCountry();
        }

    }
    return country;
      
   }
  public double loansFunded(String countryNm)
   {
    double total = 0.0;
       Loan loan;
       
       
      for(int i = 0; i < data.size(); i++) 
      {
         loan = data.get(i);

         
         
         
         if(data.contains(countryNm))
         {
         total = total + loan.getLoanAmount();
         
         
       
         }
      
      }
      return total;
   }
}

      

