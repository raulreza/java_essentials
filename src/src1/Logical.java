package src1;

import libs.Input;

public class Logical {

	public static void main(String args[])
	{
		Input.print("Se va a hacer o no se va a hacer la carnita asada?\n");
		int c = Input.get_char();
	    if (c == 'Y' || c == 'y')
	    {
	    	System.out.print("yes\n");
	    }
	    else if (c == 'N' || c == 'n')
	    {
	    	System.out.print("no\n");
	    }
	    else
	    {
	    	System.out.print("error\n");
	    }
	
	}
}



