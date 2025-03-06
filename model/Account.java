package com.exponent.bankapplication.model;
public class Account {


		
		private int accountNo;
		private String accountName;
		private String aadharCard;
		private String panCard;
		private String contact;
		private String mail;
		private double accountBalance;
		public int getAccountNo() {
			return accountNo;
		}
		public void setAccountNo(int accountNo) {
			this.accountNo = accountNo;
		}
		public String getAccountName() {
			return accountName;
		}
		public void setAccountName(String accountName) {
			this.accountName = accountName;
		}
		public String getAadharCard() {
			return aadharCard;
		}
		public void setAadharCard(String aadharCard) {
			this.aadharCard = aadharCard;
		}
		public String getPanCard() {
			return panCard;
		}
		public void setPanCard(String panCard) {
			this.panCard = panCard;
		}
		
		
		public String getContact() {
			return contact;
		}
		public void setContact(String contact) {
			this.contact = contact;
		}
		public String getMail() {
			return mail;
		}
		public void setMail(String mail) {
			this.mail = mail;
		}
		public double getAccountBalance() {
			return accountBalance;
		}
		public void setAccountBalance(double accountBalance) {
			this.accountBalance = accountBalance;
		}
		@Override
		public String toString() {
			return "Account [accountNo=" + accountNo + ", accountName=" + accountName + ", aadharCard=" + aadharCard
					+ ", panCard=" + panCard + ", contact=" + contact + ", mail=" + mail + ", accountBalance="
					+ accountBalance + "]";
		}
		
		
		
		
	
	
}
