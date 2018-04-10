package src1;

import libs.Input;

public class Hello2 {

	public static void main(String args[])
	{
		Input.print("What is your name? ");
		String name = Input.get_string();
		System.out.println("hello, "+ name + "\n");   
	}
}