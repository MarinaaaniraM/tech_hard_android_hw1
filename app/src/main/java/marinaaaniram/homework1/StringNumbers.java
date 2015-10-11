package marinaaaniram.homework1;

public class StringNumbers {

    private static final String EDINICHI[] = {"", "один", "два", "три", "четыре",
            "пять", "шесть", "семь", "восемь", "девять"};
    private static final String DESYAT[] = {"десять", "одиннадцать", "двенадцать", "тринадцать",
            "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемьнадцать", "девятнадцать"};
    private static final String DESYATKI[] = {"", "десять", "двадцать", "тридцать", "сорок",
            "пятьдесят", "шестьдесят","семьдесят", "восемьдесят", "девяносто"};
    private static final String SOTNI[] = {"", "сто", "двести", "триста", "четыреста", "пятьсот",
            "шестьсот", "семьсот", "восемьсот", "девятьсот"};
    private static final String LIONS[] = {"", "тысяча", "миллион",
            "миллиард", "триллион", "квадриллион", "квинтиллион", "секстиллион", "септиллион",
            "октиллион", "нониллион", "дециллион"
    };

    public String convertToString(int number) {
        String answer = null;

        if (number >= 0 && number < 10)
            answer = EDINICHI[number];

        else if (number >= 10 && number < 20)
            answer = DESYAT[number - 10];

        else if (number >= 20 && number < 100)
            answer = DESYATKI[number / 10] + " " + EDINICHI[number % 10];

        else if (number >= 100 && number < 1000)
            answer = SOTNI[number / 100] + " " + convertToString(number % 100);

        else if (number == 1000)
            answer = LIONS[1];

        return answer;
    }
}
