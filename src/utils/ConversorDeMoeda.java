package utils;

public class ConversorDeMoeda {

	public static final double IOF = 0.06;
	
	public static double resultado(double dollar, double reais) {
		return dollar * reais * (1.0 + IOF);
	}
}
