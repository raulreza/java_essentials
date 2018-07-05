package src1;

import libs.Input;

public class Conditions {

	public static void main(String args[])
	{
		Input.print("Enter an\n");
		System.out.print("Integer value: ");
		int i = Input.get_int();
		if (i < 0)
		{
			System.out.print("\nThe Integer value is negative\n");
		}
		else if (i > 0)
		{
			System.out.print("\nThe Integer value is positive\n");
		}
		else
		{
			System.out.print("\nThe Integer value is zero\n");
		}
	}
}
