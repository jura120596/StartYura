import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        int step = 0;
        int personX;
        int personY;
        int personLive = 3;
        int sizeBoard = 5;
        personX = 1 + sizeBoard / 2;
        personY = 1 + sizeBoard / 2;
        step = step + 1;
        step += 1;
        step -= 10; // эквивалентно: step = step - 10
        step *= 5; // эквивалентно: step = step * 5
        step /= 2; // эквивалентно: step = step / 2
        String person = "Г";
        String monster = "Мм";
        String gamingField = "+ —— + —— + —— +\n"
                + "|    |    |    |\n"
                + "+ —— + —— + —— +\n"
                + "|    | " + monster + " |    |\n"
                + "+ —— + —— + —— +\n"
                + "| " + person + " |    |    |\n"
                + "+ —— + —— + —— +";
        String begin = "|    | |";
        String end = " |    |";
        String full = begin + monster + end; // |    | Мм |    |
        Scanner scanner = new Scanner(System.in);
        System.out.println("Привет! Ты готов начать играть в игру? (Напиши: ДА или НЕТ)");
        System.out.println("Количество жизней: " + personLive);
        System.out.println("Выбери сложность игры(от 1 до 5):");
        int difficultGame = scanner.nextInt();
        System.out.println("Выбранная сложность:\t" + difficultGame);
        String answer = scanner.nextLine();
//        personLive = scanner.nextInt();
        System.out.println("Ваш ответ:\t" + answer);
        if (answer.equals("ДА")) {
            System.out.println("Начинаем играть");
            System.out.println("Введите куда будет ходить персонаж(ход возможен только по вертикали и горизонтали на одну клетку;");
            System.out.println("Координаты персонажа - (x: " + personX + ", y: " + personY + "))");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if (x != personX && y != personY) {
                System.out.println("Некорректный ход");
            } else if (Math.abs(x - personX) == 1 || Math.abs(y - personY) == 1) {
                personX = x;
                personY = y;
                step += 1;
            } else {
                System.out.println("Координаты не поменялись");
            }
            System.out.println("New line");
        }
    }
}
