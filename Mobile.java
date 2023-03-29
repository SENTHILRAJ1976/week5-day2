package week1.day1;

public class Mobile {
	
	public void sendSMS() {
		System.out.println("From oppo");
		
	}		
		public void makeCall() {
			System.out.println("Call my friend");
		
		}	
		
	public static void main (String[] args) {
		
		Mobile call = new Mobile();
		
		call.sendSMS();
		call.makeCall();
	}

}
