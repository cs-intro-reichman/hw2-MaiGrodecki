// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int n = Integer.parseInt(args[0]);
		String mode = args[1];
		int seed = 1;
		int count = 0;
		boolean verbose = (args[1].equals("v"));
		for (int i = 1; i <= n; i++){
			seed = i;
			count = 1;
			while (seed != 1 || count == 1){
				if (seed % 2 == 0){
					if (verbose)
					{
						System.out.print(seed + " "); 
					}
					count++;
					seed = seed / 2;
				} else {
					if (verbose){
					System.out.print(seed + " ");
					}
					count++;
					seed = seed * 3 + 1;

				}
			}
			if (verbose){
				System.out.print(seed + " ");
				System.out.println("(" + count + ")");
			}
		}
			System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
		} 
	}
