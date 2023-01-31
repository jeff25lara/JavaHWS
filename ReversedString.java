package Class16HW;

public class ReversedString {
    public String strRev(String str) {
        StringBuilder st = new StringBuilder(str);
        StringBuilder a = st.reverse();
        String reversed = a.toString();
        for (int i = reversed.length() - 1; i >= 0; i--) {
            return reversed;
        }
        return str;
    }

    public static void main(String[] args) {
        ReversedString str = new ReversedString();
        System.out.println(str.strRev("Let's learn Java"));
    }
}
