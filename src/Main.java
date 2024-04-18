//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String S = new String("Аргентина manyt негра");
        System.out.print("A word with just Roman character is " + getWord(S));

    }

    public static String getWord(String S) {
        if (S.matches("[a-zA-Z]+")) {

        }
        return S;
    }
}




