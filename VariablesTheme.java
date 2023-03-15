public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1. Создание переменных и вывод их значений на консоль");
        byte num = 8;
        char rav = '=';
        short pam = 32;
        int vid = 8;
        long oc = 10;
        float usb = 3;
        double chast = 2.36;
        System.out.println("Количество ядер "+ rav + " " + num);
        System.out.println("Количество памяти ОЗУ "+ rav + " " + pam);
        System.out.println("Количество видеопамяти "+ rav+" " + vid);
        System.out.println("Версия Windows " + rav +" " + oc );
        System.out.println("Версия слотов USB " + rav +" " + usb);
        System.out.println("Частота ядра " + rav +" " + chast+'\n');

        System.out.println("2. Расчет стоимости товара со скидкой");
        int a = 100 / 100 * 11;
        int b = 200 / 100 * 11;
        int sum = a + b;
        int ras = 100 + 200 - sum;
        System.out.println("Сумма скидки = " + sum +" " + "рубля");
        System.out.println("Общая стоимость товаров со скидкой = " + ras + " рубля\n");

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
        System.out.println("значение после декремента="+(--num1) + '\n');
        System.out.println("Первоначальное максимальное значение типа short=" + num2);
        System.out.println("Значение после инкремента=" + (++num2));
        System.out.println("значение после декремента="+(--num2) + '\n');
        System.out.println("Первоначальное максимальное значение типа int=" + num3);
        System.out.println("Значение после инкремента=" + (++num3));
        System.out.println("значение после декремента="+(--num3) + '\n');
        System.out.println("Первоначальное максимальное значение типа Long=" + num4);
        System.out.println("Значение после инкремента=" + (++num4));
        System.out.println("значение после декремента="+(--num4) + '\n');

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
        char g = 35;
        char h = 38;
        char i = 64;
        char j = 94;
        char k = 95;
        System.out.println("Код Символа" + "    " + "DEC символ");
        System.out.println("    35" + "               " + g);
        System.out.println("    38" + "               " + h);
        System.out.println("    64" + "               " + i);
        System.out.println("    94" + "               " + j);
        System.out.println("    95" + "               " + k + '\n');

        System.out.println("7. Вывод в консоль ASCII-арт Дюка");
        char num5 = '/';
        char num6 = '\\';
        char num7 = '(';
        char num8 = ')';
        System.out.println("      " + num5 + num6);
        System.out.println("     " + num5 + "  " + num6);
        System.out.println("    " + num5 + k + num7 + " " + num8 + num6);
        System.out.println("   " + num5 + "      " + num6);
        System.out.println("  " + num5 + k + k + k + k + num5 + num6 + k + k + num6 + '\n');
        
        System.out.println("8. Вывод количества сотен, десятков и единиц числа");
        int number = 123;
        int sot = number / 100;
        int des = number % 100 / 10;
        int ed = number % 10;
        int summa = sot + des + ed;
        int proisv = sot * des * ed;
        System.out.println("Число 123 содержит:");
        System.out.println(sot + "-Сотню");
        System.out.println(des + "-Десятка");
        System.out.println(ed + "-единицы");
        System.out.println("Сумма его цифр =" + " " + summa);
        System.out.println("Произведение =" + " " + proisv + '\n');

        System.out.println("9. Вывод времени");
        int number1 = 86399;
        int hh = number1 / 3600;
        int mm = number1 / 60 % 60;
        int ss = number1 % 60;
        System.out.println(hh + ":" + mm + ":" + ss);

    }
}
