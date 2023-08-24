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
    public void setYear(int _year){
        year = _year;
    }
    public void setMonth(int _month){
        month = _month;
    }
    public void setDay(int _day){
        day = _day;
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
    public String toString(){
        String dateString = year + "-"+month+"-"+day;
        System.out.println(dateString);
        return dateString;
    }
}
