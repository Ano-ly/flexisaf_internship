//A program that calculates the number of hours in days and weeks

//class HoursAndDays
class HoursAndDays {
    /** 
     * main - entrypoint of program
     * @args: command line arguments 
    */
    public static void main(String[] args) {
        CalculateHours newCalculator = new CalculateHours();
        System.out.println("There are " + newCalculator.numOfHoursFromDay(1) + " hours in 1 day.");
        System.out.println("There are " + newCalculator.numOfHoursFromWeek(10) + " hours in 10 weeks.");
    }
}

//interface CalcHours
interface CalcHours {
    int numOfHoursFromDay(int days);
    int numOfHoursFromWeek(int weeks);
}

//class CalculateHours
class CalculateHours implements CalcHours{
    static int HOURS_IN_A_DAY = 24;
    static int DAYS_IN_A_WEEK = 7;

    /**
     * numOfHoursFromDay - Calculate number of hours when given number of days
     * @days: Number of days to be converted to hours
    */
    public int numOfHoursFromDay(int days) {
        return (days * HOURS_IN_A_DAY);
    }
    /**
     * numOfHoursFromWeek - Calculate number of hours when given number of weeks
     * @weeks: Number of weeks to be converted to hours
    */
    public int numOfHoursFromWeek(int weeks) {
        return (weeks * DAYS_IN_A_WEEK * HOURS_IN_A_DAY);
    }
}