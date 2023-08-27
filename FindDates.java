
public class FindDates {
    public static void main(String[] Args){
        printBonusDatesBetween(0,10000);
    }
    public static void printBonusDatesBetween(int fromYear, int toYear){
        DateCustom date_1 = new DateCustom(fromYear);
        while(date_1.getYear() <= toYear){
            if(checkDateForPalindrome(date_1.toPalindromeString())){
                System.out.println(date_1);
            }
            date_1.increaseDate();
        }
    }
    public static Boolean checkDateForPalindrome(String date){
        String reverseDate = reverseString(date);
        return date.equals(reverseDate);
    }
    public static String reverseString(String string_1){
        String newString = "";
        for(int i = string_1.length()-1; i >=0; i --){
            newString = newString + "" + string_1.charAt(i);
        }
        return newString;
    }
}
