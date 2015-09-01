package passwordCracker;
import java.util.LinkedList;
import java.util.ListIterator;
public class PasswordCrackerSingle {

	/*
	 * To generate Permutations of an array of given size
	 */
	public void generatePermutations(String s)
	{
		
	}
	
	/*
	 * To generate Combination of all possible numbers[0-9] of size n
	 */
	public static void generateCombinations(int index, int n, StringBuilder str, LinkedList<String> comb)
	{
		if(index >=n) {
			//System.out.println(str);
			comb.addLast(str.toString());
			return;
		}
		String numbers="0123456789";
		String alphas="abcdefghijklmnopqrstuvwxyz";
		for(int i=0;i<numbers.length();++i)
		{
			str.append(numbers.charAt(i));
			generateCombinations(index+1, n, str, comb);
			str.deleteCharAt(index);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		StringBuilder str = new StringBuilder();
		LinkedList<String> combinations = new LinkedList<String>();
		generateCombinations(0,7,str, combinations);
		//System.out.println(combinations.size());
		ListIterator<String> listIterator = combinations.listIterator();
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
		/*while (listIterator.hasNext()) {
	        System.out.println(listIterator.next());
	    }*/
	}

}
