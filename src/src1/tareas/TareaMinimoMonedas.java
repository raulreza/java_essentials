package src1.tareas;

import libs.Input;

public class TareaMinimoMonedas {

	static int numMonedas = 0;
	static int remanente;

		public static void main(String[] args) {
			int remanente = preguntaMonto();
			remanente = calc(remanente, 25);
			remanente = calc(remanente, 10);
			remanente = calc(remanente, 5);
			calc(remanente, 1);
			Input.print(numMonedas);
		}

		private static int preguntaMonto() {
			Input.print("Cuánto cambio te debo? ");
			double x = Input.get_double();
			int tot = (int) (x * 100);
			return tot;
		}
		
		private static int calc(int tot, int i) {
			int div = (tot/i);
			int sob = (tot % i);
			if (div > 0) {
				numMonedas = numMonedas + div;
			}
			return remanente = sob;
		}
}
