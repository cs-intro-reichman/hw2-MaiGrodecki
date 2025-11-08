public  class  TestRandom {
	public static void main(String[]  args) {
		int N = Integer.parseInt(args[0]);
		int countBiggerThanHalf = 0;
		int countLessOrEqualToHalf = 0;
		for(int i = 0; i < N; i++){
			double num = Math.random();
			if (num > 0.5){
				countBiggerThanHalf++;
			}
			else {
				countLessOrEqualToHalf++;
			}
		}
		System.out.println("> 0.5: " + countBiggerThanHalf + " times");
		System.out.println("<= 0.5: " + countLessOrEqualToHalf + " times");
		if (countBiggerThanHalf == 0 || countLessOrEqualToHalf == 0){
			return;
		}
		else {
			double ratio = (double)countBiggerThanHalf / (double)countLessOrEqualToHalf;
			System.out.println("Ratio: " + ratio);
		}
		
	}
}
