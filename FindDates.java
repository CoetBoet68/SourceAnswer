
public class FindDates {
    public static void main(String[] Args){
        DateCustom date_1 = new DateCustom(1);
        System.out.println(checkDateForPalindrome(date_1.toString()));
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
