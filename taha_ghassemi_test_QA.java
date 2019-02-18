public class taha_ghassemi_test_QA {
	public static void main(String[] args){
		if(QA.overlap(1,5,2,6))
			System.out.println("Success");
		else
			System.out.println("Failure");
		if(QA.overlap(1,5,6,8))
			System.out.println("Failure");
		else
			System.out.println("Success");		
	}
}
