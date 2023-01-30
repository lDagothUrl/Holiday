import java.time.LocalDate;
public class ProgrammersDay {
    private LocalDate localDate;
    public ProgrammersDay(int year){
        if(year % 400 == 0) {
            localDate = LocalDate.of(year, 9, 12);
        } else if (year % 100 == 0) {
            localDate = LocalDate.of(year, 9,13);
        }else if (year % 4 == 0){
            localDate = LocalDate.of(year, 9, 12);
        }else {
            localDate = LocalDate.of(year, 9, 13);
        }
    }

    public LocalDate getLocalDate() {
        return localDate;
    }
}
