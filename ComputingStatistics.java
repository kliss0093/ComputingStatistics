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
       double amount = 0.0;
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
   

    
}
