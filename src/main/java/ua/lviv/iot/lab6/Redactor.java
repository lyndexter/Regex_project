package ua.lviv.iot.lab6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Redactor {

    public String removeArticle(final String text) {

        Pattern articlePattern = Pattern.compile("( a )|( an )|( the )");
        Matcher matcher = articlePattern.matcher(text);
        System.out.println(matcher.replaceAll(" "));
        return matcher.replaceAll(" ");

    }

    public String removePrepositions(final String text) {

        Pattern prepositionsPattern = Pattern.compile("( or )|( are )|( in )|( out )|( on )");
        Matcher matcher = prepositionsPattern.matcher(text);
        System.out.println(matcher.replaceAll(" "));
        return matcher.replaceAll(" ");

    }

}
