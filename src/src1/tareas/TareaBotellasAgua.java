package src1.tareas;

import libs.Input;

public class TareaBotellasAgua {

	public static void main(String[] args) {
		int x = preguntaLitros();
		imprimeTotal(x);
				
	}

	public static int preguntaLitros() {
		System.out.print("Minutos: ");
		int y = Input.get_int();
		return y;
		
	}

	public static void imprimeTotal(int z) {
		System.out.print("Botellas: " + (z * 12));
		
	}

}
