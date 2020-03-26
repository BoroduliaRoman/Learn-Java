public class GuessGame {
    // GuessGame содержит три перем. экземпляра для 3х обьектов player
    Player p1;
    Player p2;
    Player p3;

    // Создаём 3 обьекта Player и присваиваем их 3м перем. экземпляра.
    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        // Обьявляем 3 перем. для хранения вариантов от каждого игрока.
        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        // Обьявляем 3 перем. для хранения правильности или неправильности (true or false) ответов игроков
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        // Создаём число, которое игроки должны угадать.
        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Я загадываю число от 0 до 9...");

        while (true) {
            System.out.println("Число, которое нужно угадать, - " + targetNumber);

            // Вызываем метод guess() из каждого обьекта Player
            p1.guess();
            p2.guess();
            p3.guess();

            // Извлекаем варианты каждого игрока(результаты работы их методов guess()), получая доступ к их перем. number
            guessp1 = p1.number;
            System.out.println("Первый игрок думает, что это " + guessp1);

            guessp2 = p2.number;
            System.out.println("Второй игрок думает, что это " + guessp2);

            guessp3 = p3.number;
            System.out.println("Третий игрок думает, что это " + guessp3);

            // Проверяем варианты каждого из игроков на соответствие загаданному числу. Если игрок угадал, то присваиваем соответствующей перем. значение true
            if (guessp1 == targetNumber) {
                p1isRight = true;
            }
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }

            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("У нас есть победитель!");
                System.out.println("Первый игрок угадал?" + p1isRight);
                System.out.println("Второй игрок угадал?" + p2isRight);
                System.out.println("Третий игрок угадал?" + p3isRight);
                System.out.println("Конец игры");
                break;// Игра окончена, так что прерываем цикл
            } else {
                // Мы должны продолжать, так как никто не угадал!
                System.out.println("Игроки должны попробовать ещё раз.");
            }
        }
    }
}
