package week1.assignments;

public class MyMobile {

	int num1=2;
	int num2=4;
	public void makeCall() {
		
		System.out.println("Method1 makeCall");

	}
	public void sendMsg() {
		System.out.println("Method2 sendMsg");

	}
	private void payBills() {
		System.out.println("Method3 private payBills");
		

	}
	public static void main(String[] args) {
		MyMobile user = new MyMobile();
		user.makeCall();
		user.sendMsg();
		user.payBills();
		System.out.println(user.num1);
		System.out.println(user.num2);
		
	}
}
