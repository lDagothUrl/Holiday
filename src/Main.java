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
                System.out.println("\nВведен не год " + e);
            }
        }
        System.out.println("\nДень программиста: " + new ProgrammersDay(year).getLocalDate());
    }
}
