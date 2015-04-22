package isValid;
public class test
{
	public static void main(String[] args)
	{
		String c = "(";
		if (c == "(" || c == "{" || c == "[")
		{
			System.out.println(true);
		}
		System.out.println(c == "(" ? true : false);
	}
}
