package org.company;

public class CompanyInfo {

	private void companyName() {

		System.out.println("SPI Global Technologies pvt. ltd");
	}
	private void companyId() {
		System.out.println("XYZ");
		
	}
	private void companyAddress() {
		System.out.println("No: 11, XYZ Road, Chennai");
	}
	public static void main(String[] args) {
	CompanyInfo tt = new CompanyInfo();
	tt.companyName();
	tt.companyId();
	tt.companyAddress();
	}
}
