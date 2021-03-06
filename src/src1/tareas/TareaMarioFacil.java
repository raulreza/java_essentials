package src1.tareas;

import libs.Input;

public class TareaMarioFacil {

	public static void main(String[] args) {
		int alt = askHeight();
//		int alt = 5;
		printPyramid(alt);
	}

	private static int askHeight() {
		Input.print("Height: ");
		int z = Input.get_int();
		return z;
	}

	private static void printPyramid(int h) {
		int max = h;
		int min = h-2;
		int cnt = 1;
		do {
			for (int x = 1; x < max; x++) {
			Input.print(" ");
			}
			for (int y = h; y > min; y--) {
				Input.print("#");
			}
			Input.print(" " + cnt);
			Input.print("\n");
			min--;
			max--;
			cnt++;
		} while (max >= 1);

	}

}
