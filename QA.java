//Question A
public class QA {
	public static boolean overlap(double x1, double x2, double x3, double x4){
	/*Two segments overlap iff the lesser of the right endpoints is greater than or 
	equal to the greater of the left endpoints. That is what is tested below.*/
		return Math.min(Math.max(x1,x2),Math.max(x3,x4))>=Math.max(Math.min(x1,x2),Math.min(x3,x4));
	}	
}
