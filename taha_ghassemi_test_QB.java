public class taha_ghassemi_test_QB {
	public static void test(int actual, int expected){
		if(actual==expected)
			System.out.println("Success");
		else
			System.out.println("Failure");
	}
	public static void main(String[] args){
		test(QB.compare("1.1","1.2"),-1);
		test(QB.compare("1.1","1.2.1"),-1);
		test(QB.compare("1.1","1.1.1"),-1);	
		test(QB.compare("43.23","43.23"),0);
		test(QB.compare("1.1.1","1.1"),1);	
		test(QB.compare("1.2","1.1"),1);
		test(QB.compare("1.2.1","1.1"),1);
		try{	
			QB.compare("1.2.1","1,1castle");
			System.out.println("Failure");
		} catch(NumberFormatException e){
			System.out.println("Success");
		}
	}
}
