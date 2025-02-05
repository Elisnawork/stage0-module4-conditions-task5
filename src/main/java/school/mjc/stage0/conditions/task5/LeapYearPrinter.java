package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {

        switch (year % 400 == 0 ? 0 : year % 100 == 0 ? 1 : year % 4 == 0 ? 2 : 3) {
            case 0:
            case 2:
                System.out.println("leap");
                break;
            default:
                System.out.println("not leap");
        }
        }
}
