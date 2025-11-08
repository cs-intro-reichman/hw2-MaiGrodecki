public class CalcPi {
	public static void main(String [] args) { 
		int numOfTerns = Integer.parseInt(args[0]);
		double pi = Math.PI;
		double numerator = 1;
		double denominator = 1;
		double aprox = 0;
		for (int i = 0; i < numOfTerns; i++){
			double term = numerator / denominator;
			if (i == 0){
				aprox = aprox + term;
			}
			else if (i % 2 == 0){
			aprox = aprox + term;
			}
			else { aprox = aprox - term;
			}
			denominator+=2;
		}
		aprox = aprox * 4;
		System.out.println("pi according to Java: " + pi);
		System.out.println("pi, approximated:     " + aprox);
	}
}
