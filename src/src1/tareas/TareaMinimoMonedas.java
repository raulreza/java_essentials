package src1.tareas;

import libs.Input;

public class TareaMinimoMonedas {

static int numMonedas;
static int remanente;

	public static void main(String[] args) {
		float tot = preguntamonto();
		calc25(tot);
		//calc10();
		//calc5():
		//calc1();
		Input.print(numMonedas);
		
		
	}

	private static void calc25(int m25) {
		m25 = (m25 / 25);
		System.out.print(m25 + " monedas de 25");
		return numMonedas;
		return remanente;
	}

	private static float preguntamonto() {
		System.out.print("Cuánto cambio te debo? ");
		float tot = Input.get_float();
		return tot;
	}

}
