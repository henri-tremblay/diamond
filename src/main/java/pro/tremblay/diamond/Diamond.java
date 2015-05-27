package pro.tremblay.diamond;

import java.util.Arrays;

/**
 * @author Henri Tremblay
 */
public class Diamond {
    public String print(char letter) {
        if(letter == 'a') {
            return "a";
        }

        int index = letter - 'a';
        int spaces = index;
        int between = 1;

        StringBuffer sb = new StringBuffer(spaces(spaces--) + "a\n");

        for(int i = 1; i <= index; i++) {
            sb.append(spaces(spaces--));
            appendChar(sb, i, between);
            sb.append('\n');

            between+=2;
        }

        spaces = 0;
        between-=4;

        for(int i = index - 1; i > 0; i--) {
            sb.append(spaces(++spaces));
            appendChar(sb, i, between);
            sb.append('\n');

            between-=2;
        }

        sb.append(spaces(++spaces) + "a");
        return sb.toString();
    }

    private void appendChar(StringBuffer sb, int i, int spaces) {
        char c = (char) ('a' + i);
        sb.append(c);
        sb.append(spaces(spaces));
        sb.append(c);
    }

    public String spaces(int number) {
        char[] a = new char[number];
        Arrays.fill(a, ' ');
        return new String(a);
    }
}
