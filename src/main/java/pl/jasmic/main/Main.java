package pl.jasmic.main;

import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        String deleteWhitespace = StringUtils.deleteWhitespace("test TEST test");
        System.out.println(deleteWhitespace);

        System.out.println(StringUtils.reverse("abcde"));

        System.out.println(StringUtils.trim("   testing trim method   "));
    }
}
