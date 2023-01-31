package Class16HW;

public class VowelString {
    private String vowels(String str) {
        return str.replaceAll("[^aeiou]", " ");
    }

    public static void main(String[] args) {
        VowelString a = new VowelString();
        System.out.println(a.vowels("I love Java"));
    }
}
