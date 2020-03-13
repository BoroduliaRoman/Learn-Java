public class PhraseOMatic {
    public static void main(String[] args) {

        // Создаём три набора слов для выбора. Добавляем собственные слова!
        String[] wordListOne = {"круглосуточный", "трех-звенный", "30000-футовый", "взаимный", "обоюдный выигрыш",
                "фронтэнд", "на основе веб-технологий", "проникающий", "умный", "шесть сигм", "метод критического пути",
                "динамичный"};

        String[] wordListTwo = {"уполномоченный", "трудный", "чистый продукт", "ориентированный", "фирменный",
                "нестандартный ум", "позиционированный", "сетевой", "сфокусированный", "использованный с выгодой",
                "выровненный", "нацеленый на", "общий", "совместный", "ускоренный"};

        String[] wordListThree = {"процесс", "пункт разгрузки", "выход из положения", "тип структуры", "талант",
                "подход", "уровень завоеванного внимания", "портал", "период времени", "обзор", "образец",
                "пункт следования"};

        // Вычисляем, сколько слов в каждом списке
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        // Генерируем три случайных числа
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        // Строим фразу
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        // Выводим фразу на экран
        System.out.println("Всё, что нам нужно, - это " + phrase);
    }
}
