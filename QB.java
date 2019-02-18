//Question B
public class QB {
	/**
	*returns -1 if s1 is lesser, 1 if s2 is lesser and 0 if they are equal.
	*Throws NumberFormatException in the case of a malformed string.
	*/
	public static int compare(String s1, String s2){
		//Split on period
		String[] s_1 = s1.split("\\.");
		String[] s_2 = s2.split("\\.");

		/*lengthComparison is -1 if s_1 has less length, 1 if s_2 has less length and
		0 if they have equal length.*/
		int lengthComparison = (int) Math.signum(s_1.length-s_2.length);

		//Iterate until shorterLength to ensure we do not get an ArrayIndexOutOfBoundsException
		int shorterLength = Math.min(s_1.length,s_2.length);
		for(int i=0;i<shorterLength;i++){ 

			/*if one of the corresponding fields is strictly less than the other, we are done. Otherwise, we must keep searching. Here is where a NumberFormatException is thrown in the case of a string with non-numeric and non-period characters, but I think that is acceptable.*/
			int first = Integer.parseInt(s_1[i]);
			int second = Integer.parseInt(s_2[i]);
			if(first<second)
				return -1;
			else if(first>second)
				return 1;		
		}
		
		//If all corresponding fields were equal, then compare lengths and the smaller length is the smaller string.
		return lengthComparison;
	}
}
