public class TimeCalc {
    public static void main(String[] args) {
        String OriginalTime = (args[0]);
        int minutesToAdd = Integer.parseInt(args[1]);
        int hourDigits = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minDigits = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));

        int totalMinutes = hourDigits * 60 + minDigits + minutesToAdd;
        int totalHour = totalMinutes / 60;
        int newHour = totalHour % 24;
        int newMinutes = totalMinutes - (totalHour * 60);
        String newHour1 = "" + newHour;
        if(newHour < 10){
            newHour1 = "0" + newHour;
        }
        String newMinutes1 = "" + newMinutes;
        if(newMinutes < 10){
            newMinutes1 = "0" + newMinutes;
        }
        System.out.println(newHour1 + ":" + newMinutes1);

    }
}
