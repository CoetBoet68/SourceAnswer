public class DateCustom {
    private int[] months = {31,0,31,30,31,30,31,31,30,31,30,31};
    private int year =0;
    private int month = 0;
    private int day = 0;
    public DateCustom(int _year){
        year = _year;
        month = 1;
        day = 1;
    }
    public DateCustom(){

    }
    public int getYear(){
        return year;
    }
    public int getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }
    public void increaseDate(){
        int max = 0;
        if(month == 2){
            if(isLeapYear(year)){
                max = 29;
            }else{
                max =28;
            }
        }else{
            max = months[month-1];
        }
        day++;
        if(day > max){
            day = 1;
           month++;
           if(month>12){
               month = 1;
               year++;
           }
        }
    }
    private boolean isLeapYear(int _year){
        String sYear = _year + "";
        String lastDigits = "";
        if(sYear.length()==3){
            lastDigits = sYear.substring(1,3);
            if(lastDigits.equals("00")){
                return _year%400 == 0;
            }else{
                return _year%4 == 0;
            }
        }else if(sYear.length() == 4){
            lastDigits = sYear.substring(2,4);
            if(lastDigits.equals("00")){
                return _year%400 == 0;
            }else {
                return _year % 4 == 0;
            }
        }else{
            return _year%4 == 0;
        }
    }
    public String toString(){
        String dateString = formatWithZeroes(year,4) + "-"+formatWithZeroes(month,2)+"-"+formatWithZeroes(day,2);
        return dateString;
    }
    public String toPalindromeString(){
        String dateString = formatWithZeroes(year,4) + formatWithZeroes(month,2)+formatWithZeroes(day,2);
        return dateString;
    }
    private String formatWithZeroes(int date, int digits){
        String sDate = date + "";
        while(sDate.length()< digits){
            sDate = "0" +sDate;
        }
        return sDate;
    }
}
