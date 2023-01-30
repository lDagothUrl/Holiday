import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year = 1;
        boolean flag = true;
        while (flag){
        try {
                System.out.print("Введите год: ");
                year = new Scanner(System.in).nextInt();
                flag = false;
            }catch(Exception e){
                System.out.println("Введен не год " + e);
            }
        }
        System.out.println();
        ProgrammersDay progDay = new ProgrammersDay(year);
        System.out.println("День программиста: " + progDay.getLocalDate());
    }
}
