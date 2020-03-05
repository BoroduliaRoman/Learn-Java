public class BeerSong { // Главный класс приложения
    public static void main(String[] args) { // Главная функция
        int beerNum = 99; // Целочисленная переменная со значением 99
        String word = "бутылок (бутылки)"; // Строковая переменная

        while (beerNum > 0) { // Запускаем цикл while с условием, что пока перем. beerNum больше 0, ты выполняем

            if (beerNum == 1) { // Добавляем условие в цикл: если перем. beerNum равно 1, то выполняем это условие
                word = "бутылка"; // В перем. word отправляем это значение
            }

            System.out.println(beerNum + " " + word + " пива на стене"); //Выводим на экран перем и строки
            System.out.println(beerNum + " " + word + " пива.");
            System.out.println("Возьми одну");
            System.out.println("Пусти по кругу");
            beerNum = beerNum - 1; // После вывода строк отнимаем от перем. beerNum 1

            if (beerNum > 0) { // Добавляем второе условие в цикл: пока перем. beerNum больше 0 - выполняем:
            } else { // Добавляем к условию оператор else:
                System.out.println("Нет бутылок пива на стене");   //Выводим на экран
            }
        }
    }
}
