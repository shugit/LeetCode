
package countAndSay;

/**
 * 1. 1 <br>
 * 2. 11 <br>
 * 3. 21 <br>
 * 4. 1211 <br>
 * 5. 111221 <br>
 * 6. 312211 <br>
 * 7. 13112221 <br>
 * 8. 1113213211 <br>
 * 9. 31131211131221 <br>
 * 10. 13211311123113112211 <br>
 * 
 * @author <a href="mailto:shuzhou@expedia.com">shuzhou</a>
 *
 */
public class Solution
{

	public static void main(String[] args)
	{
		System.out.println(new Solution().countAndSay(10));
	}

	public String countAndSay(int n)
	{
		String[] array = new String[n];
		array[0] = "1";
		for(int i = 1; i<n; i++){
			array[i] = count(array[i-1]);
		}
		return array[n-1];
	}

	private String count(String string)
	{
		String[] split = string.split("");
		String result = "";
		
		String lastChar = split[0];
		int count = 1;
		for(int i = 1; i<split.length; i++){
			if(split[i].equals(lastChar)){
				count++;
			} else{
				result+=count+lastChar;
				count = 1;
				lastChar = split[i];
			}
		}
		return result+count+lastChar;
	}


}
