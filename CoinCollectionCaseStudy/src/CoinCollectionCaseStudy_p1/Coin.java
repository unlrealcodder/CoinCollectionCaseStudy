package CoinCollectionCaseStudy_p1;

import java.time.LocalDate;

public class Coin{
	int coinId;
	String country;
	String denomination;
	LocalDate yearOfminting;
	double currentValue;
	LocalDate acquireDate;
	
	public Coin() {
		// TODO Auto-generated constructor stub
	}

	Coin(int coinId, String country,String denomination, LocalDate yearOfminting, double currentValue, LocalDate acquireDate) {
		super();
		this.coinId = coinId;
		this.country = country;
		this.denomination = denomination;
		this.yearOfminting = yearOfminting;
		this.currentValue = currentValue;
		this.acquireDate = acquireDate;
	}

	int getCoinId() {
		return coinId;
	}

	void setCoinId(int coinId) {
		this.coinId = coinId;
	}

	String getCountry() {
		return country;
	}

	void setCountry(String country) {
		this.country = country;
	}

	String getDenomination() {
		return denomination;
	}

	void setDenomination(String denomination) {
		this.denomination = denomination;
	}

	LocalDate getYearOfminting() {
		return yearOfminting;
	}

	void setYearOfminting(LocalDate yearOfminting) {
		this.yearOfminting = yearOfminting;
	}

	double getCurrentValue() {
		return currentValue;
	}

	void setCurrentValue(double currentValue) {
		this.currentValue = currentValue;
	}

	LocalDate getAcquireDate() {
		return acquireDate;
	}

	void setAcquireDate(LocalDate acquireDate) {
		this.acquireDate = acquireDate;
	}

	@Override
	public String toString() {
		return "Coin [coinId=" + coinId + ", country=" + country + ", denomination=" + denomination + ", yearOfminting="
				+ yearOfminting + ", currentValue=" + currentValue + ", acquireDate=" + acquireDate + "]";
	}
	
	
}

