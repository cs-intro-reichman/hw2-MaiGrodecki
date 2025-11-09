
public class Cheers {
        public static void main(String[] args) {
                String word = args[0].toUpperCase();
                int number = Integer.parseInt(args[1]);
                String checkLetter = "AEFHILMNORSX";
                for (int i = 0; i < word.length(); i++){
                        char letter = word.charAt(i);
                        int isLetter = checkLetter.indexOf(letter);
                        if(isLetter != -1){
                                System.out.println("Give me an " + letter + ": " + letter + "!");
                        } else {
                                System.out.println("Give me a  " + letter + ": " + letter + "!");
                        }
                }
                System.out.println("What does that spell?");
                for (int i = 0; i < number; i++){
                        System.out.println(word + "!!!");
                }
        }
}
