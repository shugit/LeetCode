package isValid;
import java.util.LinkedList;
import java.util.List;

public class Solution
{

	public static void main(String[] args)
	{
		System.out.println(new Solution().isValid("[{()}]"));
	}

	public boolean isValid(String s)
	{
		Stack stack = new Stack();
		String[] list = s.split("");
		for (String c : list)
		{
			if (c.equalsIgnoreCase("(") || c.equalsIgnoreCase("{") || c.equalsIgnoreCase("["))
			{
				stack.push(c);
				System.out.println(stack);
			}
			else
			{
				String d = stack.pop();
				System.out.println(d);
				if (d == null)
				{
					return false;
				}
				else
				{
					System.out.println((int) d.charAt(0) + "\t" + (int) c.charAt(0));
					if ((int) d.charAt(0) + 1 != (int) c.charAt(0)
							&& (int) d.charAt(0) + 2 != (int) c.charAt(0))
					{
						return false;
					}
				}
			}
		}
		if(stack.list.size() != 0){
			return false;
		}
		return true;
	}

	private boolean equal(String c, String d)
	{
		if (c.equals("(") && d.equals(")"))
		{
			return true;
		}
		if (c.equals("{") && d.equals("}"))
		{
			return true;
		}
		if (c.equals("[") && d.equals("]"))
		{
			return true;
		}
		return false;
	}

	private class Stack
	{
		LinkedList<String> list = new LinkedList<String>();

		public String pop()
		{
			if (list.size() == 0)
			{
				return null;
			}
			return list.remove(list.size() - 1);
		}

		public void push(String str)
		{
			list.add(str);
		}

		@Override
		public String toString()
		{
			String r = "";
			for (String s : list)
			{
				r += s + "\t";
			}
			return r;
		}
	}
}