package ejercicio2;

public class NegativeMinuteException extends Exception{

	@Override
	public String toString() {
		return "Los minutos no pueden ser negativos";
	}
	
}
