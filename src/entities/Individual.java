package entities;

public class Individual extends TaxPayer{

	private Double healthSpending;
	
	public Individual() {
		super();
	}
	
	
	public Individual(String name, Double anualIncome, Double healthSpending) {
		super(name, anualIncome);
		this.healthSpending = healthSpending;
	}

	public Double getHealthSpending() {
		return healthSpending;
	}


	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}


	@Override
	public Double tax() {
		if (getAnualIncome() < 20000.00) {
			return getAnualIncome() * 0.15 - getHealthSpending() * 0.5;
		}
		else {
			return getAnualIncome() * 0.25 - getHealthSpending() * 0.5;
		}
	}
	
	

}
