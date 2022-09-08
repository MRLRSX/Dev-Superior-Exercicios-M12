package ExercicioTres;

import java.util.Locale;


import ExercicioTres.entities.BusinessAccount;


public class Program {
	public static void main(String[] args) {
      Locale.setDefault(Locale.US);
      
      /*
       *  compiler does not allow abstract class instance 
       *  example Account 
       * **/      
      ExercicioTres.entities.BusinessAccount businessAccount = new BusinessAccount(1080, "Lucas", 5000.00, 10000.00);
      ExercicioTres.entities.SavingsAccount savingsAccount = new ExercicioTres.entities.SavingsAccount(2021, "Anna Clara", 100000.00, 200000.00);
      
      System.out.println(businessAccount);
      System.out.println(savingsAccount);
	}
}
