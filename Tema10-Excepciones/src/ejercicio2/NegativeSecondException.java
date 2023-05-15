package ejercicio2;

public class NegativeSecondException extends Exception{

	@Override
	public String toString() {
		return "Los segundos no pueden ser negativos";
	}
	
}
