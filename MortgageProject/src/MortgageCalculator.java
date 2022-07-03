import java.time.LocalDate;
import java.time.Period;

public class MortgageCalculator {
	
	public double computeMaxMortgage(int yearOfBirt, int month, int day, double monthlyIncome, boolean married, double monthlyIncomePartner, String profession) {
		double result=0;
		//calculate age
		LocalDate today = LocalDate.now();                          //Today's date
		LocalDate birthday = LocalDate.of(yearOfBirt, month, day);  //Birth date
		 
		Period p = Period.between(birthday, today);
		int age = p.getYears();
		System.out.println(age);
		public boolean isMonthlyIncome(double monthlyIncome){
			boolean isBasicIncome=false;
			boolean isMonthlyIncome=false;
			if(monthlyIncome>=2000 && monthlyIncome<3000){
				basicIncome=true;
			}
			if(monthlyIncome>=3000 && monthlyIncome<5000){
				mediumIncome=true;


			}
		}
		public boolean isProfession(String profession){
			boolean isDevevelopmetTeam=false;
			boolean isDevopsTeam=false;
			boolean isAcdeminicTeam=false;

			if (profession.equals("Developer") || profession.equals("Architect") || profession.equals("Scrum master")){
				isDevevelopmetTeam=true;
			}
			if (profession.equals("Tester") || profession.equals("System Administrator") || profession.equals("Technical writer")) {
				isDevopsTeam=true;
			}
			if (profession.equals("Department head") || profession.equals("Professor") ){
				isAcdeminicTeam=true;
			}


		}

		if (! married) {
			isMonthlyIncome(monthlyIncome);
			isProfession(profession);
			if (age >18 && isBasicIncome) {
				if (isDevevelopmetTeam) {
					result = 160000;
				}
				
				if (isDevopsTeam) {
					result = 120000;
				}
				
				if (isAcdeminicTeam ) {
					result = 220000;
				}
				
			}
			if (age >18 && isMediumIncome) {
				if (isDevevelopmetTeam) {
					result = 180000;
				}
				
				if (isDevopsTeam) {
					result = 140000;
				}
				
				if (isAcdeminicTeam) {
					result = 250000;
				}
				
			}
			if (age >18 && monthlyIncome>=5000) {
				if (isDevevelopmetTeam) {
					result = 220000;
				}
				
				if (isDevopsTeam) {
					result = 160000;
				}
				
				if (isAcdeminicTeam){
					 result = 280000;
				}
				
			}
			if (age < 18) {
				result = 0;
			}
		}
		else {
			double totalIncome = monthlyIncome + monthlyIncomePartner * 0.94; 
			if (age >18 && isBasicIncome) {
				if (isDevevelopmetTeam){
					result = 160000;
				} 
				
				if (isDevopsTeam) {
					result = 120000;
				}
				if (isAcdeminicTeam ) {
					result = 220000;
				}
				
			}
			if (age >18 && isMediumIncome) {
				if (isDevevelopmetTeam) {
					result = 180000;
				}
				
				if (isDevopsTeam){
					result = 140000;
				} 
				
				if (isAcdeminicTeam) {
					result = 250000;
				}
				
			}
			if (age >18 && 5000<=totalIncome) {
				if (isDevevelopmetTeam) {
					result = 220000;
				}
				
				if (isDevopsTeam) {
					result = 160000;
				}
				
				if (isAcdeminicTeam ) {
						result = 280000;
				}
			
			}
			if (age < 18) {
				result = 0;
			}

		}
		
		return result;
	}

}
