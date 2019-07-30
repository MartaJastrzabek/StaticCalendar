public class CalendarConventer {
    private static final int MONDAY = 1;
    private static final int TUESDAY = 2;
    private static final int WEDNESDAY = 3;
    private static final int THURSDAY = 4;
    private static final int FRIDAY = 5;
    private static final int SATURDAY = 6;
    private static final int SUNDAY = 7;

    public static String convertDayToString(int dayNumber){
        String day;
        switch (dayNumber){
            case MONDAY:
                day = "Poniedziałek";
                break;
            case TUESDAY:
                day = "Wtorek";
                break;
            case WEDNESDAY:
                day = "Środa";
                break;
            case THURSDAY:
                day = "Czwartek";
                break;
            case FRIDAY:
                day = "Piątek";
                break;
            case SATURDAY:
                day = "Sobota";
                break;
            case SUNDAY:
                day = "Niedziela";
                break;
            default:
                day = "Nie znany!";
        }
        return day;
    }



}
