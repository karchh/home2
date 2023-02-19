// 1. Напишите программу, чтобы найти вхождение в строке 
// (содержащей все символы другой строки).

public class programH2 {
    public static void main(String[] args)
    {
        String test = "GeekBrains";

        CharSequence seq = "e";
        boolean bool = test.contains(seq);
        System.out.println("Найден 'e'?: " + bool);

        // return false
        boolean sqFound = test.contains("x");
        System.out.println("Найден 'x'?: " + sqFound);
    }
}
// 2. Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга 
// (вхождение в обратном порядке).

    class StringRotation
{
    static boolean areRotations(String str1, String str2)
    {
        return (str1.length() == str2.length()) &&
               ((str1 + str1).indexOf(str2) != -1);
    }

    public static void main (String[] args)
    {
        String str1 = "AACCC";
        String str2 = "CCAAA";

        if (areRotations(str1, str2))
            System.out.println("Строки зеркальные друг другу");
        else
            System.out.printf("Строки не зеркальные друг другу");
    }
}
