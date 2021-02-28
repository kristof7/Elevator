import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Elevator {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("This is New York elevator, choose level, you would like to get");
        System.out.println("This skyscraper has 12 levels");
        System.out.println("You are on level 0");
        enterLevel();

    }

    public static void enterLevel() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int levelNum = 0;
        boolean retry = true;
        do {
            try {
                System.out.println("\n" + "Enter level:");
                scanner = new Scanner(System.in);
                levelNum = scanner.nextInt();
                retry = false;
            } catch (Exception e) {
                System.out.println("It's not valid value, try again..");
                retry = true;
                enterLevel();
            }
        } while (retry);
        List<Integer> levelList = new LinkedList<>();

        int level = 0;
        for (int i = 0; i <= 12; i++) {
            Thread.sleep(2000);
            levelList.add(level);
            level++;
            System.out.println(level);
            if (levelList.get(i).equals(levelNum - 1)) {
                System.out.println("It's your level, have a good day..");
                break;
            }
        }
    }
}
