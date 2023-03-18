public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1. Создание переменных и вывод их значений на консоль");
        byte core = 8;
        char ravno = '=';
        short ram = 32;
        int video = 8;
        long oc = 10;
        float usb = 3;
        double frequency = 2.36;
        System.out.println("Количество ядер "+ ravno + " " + core);
        System.out.println("Количество памяти ОЗУ "+ ravno + " " + ram);
        System.out.println("Количество видеопамяти "+ ravno +" " + video);
        System.out.println("Версия Windows " + ravno +" " + oc );
        System.out.println("Версия слотов USB " + ravno +" " + usb);
        System.out.println("Частота ядра " + ravno +" " + frequency +'\n');

        System.out.println("2. Расчет стоимости товара со скидкой");
        int a = 100 / 100 * 11;
        int b = 200 / 100 * 11;
        int summa = a + b;
        int sale = 100 + 200 - summa;
        System.out.println("Сумма скидки = " + summa + " " + "рубля");
        System.out.println("Общая стоимость товаров со скидкой = " + sale + " рубля\n");

        System.out.println("3. Вывод на консоль слова JAVA");
        System.out.println("   J    a  v     v  a ");
        System.out.println("   J   a a  v   v  a a ");
        System.out.println("J  J  aaaaa  V V  aaaaa ");
        System.out.println(" JJ  a     a  V  a     a\n");

        System.out.println("4. Отображение min и max значений числовых типов данных");
        byte num1 = Byte.MAX_VALUE;
        short num2 = Short.MAX_VALUE;
        int num3 = Integer.MAX_VALUE;
        long num4 = Long.MAX_VALUE;
        System.out.println("Первоначальное максимальное значение типа byte=" + num1);
        System.out.println("Значение после инкремента=" + (++num1));
        System.out.println("значение после декремента=" + (--num1) + '\n');
        System.out.println("Первоначальное максимальное значение типа short=" + num2);
        System.out.println("Значение после инкремента=" + (++num2));
        System.out.println("значение после декремента=" + (--num2) + '\n');
        System.out.println("Первоначальное максимальное значение типа int=" + num3);
        System.out.println("Значение после инкремента=" + (++num3));
        System.out.println("значение после декремента=" + (--num3) + '\n');
        System.out.println("Первоначальное максимальное значение типа Long=" + num4);
        System.out.println("Значение после инкремента=" + (++num4));
        System.out.println("значение после декремента=" + (--num4) + '\n');

        System.out.println("5. Перестановка значений переменных");
        int c = 2;
        int d = 5;
        System.out.println("a. Замена переменной с помощью третьей переменной:");
        System.out.println("Исходные значения переменных: с=" + c + ", а d=" + d);
        int e = c;
        c = d;
        d = e;
        System.out.println("Теперь с=" + c + " , а d=" + d + '\n');
        System.out.println("b. С помощью арифметических операций");
        System.out.println("Исходные значения переменных: с=" + c + ", а d=" + d);
        c += d;
        d = c - d;
        c -= d;
        System.out.println("Теперь с=" + c + " , а d=" + d + '\n');
        System.out.println("c. C помощью побитовой операции ^");
        System.out.println("Исходные значения переменных: с=" + c + ", а d=" + d);
        c ^= d;
        d ^= c;
        c ^= d;
        System.out.println("Теперь с=" + c + " , а d=" + d + '\n');

        System.out.println("6. Вывод символов и их кодов");
        char lattice = 35;
        char ampersand = 38;
        char at_symbol = 64;
        char caret = 94;
        char undercore = 95;
        System.out.println("Код Символа" + "    " + "DEC символ");
        System.out.println("    35" + "               " + lattice);
        System.out.println("    38" + "               " + ampersand);
        System.out.println("    64" + "               " + at_symbol);
        System.out.println("    94" + "               " + caret);
        System.out.println("    95" + "               " + undercore + '\n');

        System.out.println("7. Вывод в консоль ASCII-арт Дюка");
        char forward_slash = '/';
        char backslash = '\\';
        char left_parenthesis = '(';
        char right_parenthesis = ')';
        System.out.println("      " + forward_slash + backslash);
        System.out.println("     " + forward_slash + "  " + backslash);
        System.out.println("    " + forward_slash + undercore + left_parenthesis + 
            " " + right_parenthesis + backslash);
        System.out.println("   " + forward_slash + "      " + backslash);
        System.out.println("  " + forward_slash + undercore + undercore + undercore + undercore 
            + forward_slash + backslash + undercore + undercore + backslash + '\n');

        System.out.println("8. Вывод количества сотен, десятков и единиц числа");
        int number = 123;
        int hundreds = number / 100;
        int ten = number % 100 / 10;
        int unit = number % 10;
        int summa2 = hundreds + ten + unit;
        int multiplication = hundreds * ten * unit;
        System.out.println("Число 123 содержит:");
        System.out.println(hundreds + "-Сотню");
        System.out.println(ten + "-Десятка");
        System.out.println(unit + "-единицы");
        System.out.println("Сумма его цифр =" + " " + summa2);
        System.out.println("Произведение =" + " " + multiplication + '\n');

        System.out.println("9. Вывод времени");
        int number1 = 86399;
        int hh = number1 / 3600;
        int mm = number1 / 60 % 60;
        int ss = number1 % 60;
        System.out.println(hh + ":" + mm + ":" + ss);

    }
}
