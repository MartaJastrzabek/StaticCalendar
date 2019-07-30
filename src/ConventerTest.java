public class ConventerTest {
    public static void main(String[] args) {

        for (int i = 1; i<=7; i++){
            String day = CalendarConventer.convertDayToString(i);
            System.out.println(i + " dzień tygodnia to " + day);
        }

    }
}
