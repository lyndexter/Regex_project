package ua.lviv.iot.lab6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Redactor {

    public String removeArticle(final String text) {

        Pattern articlePattern = Pattern.compile("( a(?=\\s))|( an(?=\\s))|( the(?=\\s))|(A )|(An )|(The )");
        Matcher matcher = articlePattern.matcher(text);
        System.out.println(matcher.replaceAll(""));
        return matcher.replaceAll("");

    }

    public String removePrepositions(final String text) {

        Pattern prepositionsPattern = Pattern.compile("( or(?=\\s))|( are(?=\\s))|( in(?=\\s))|( out(?=\\s))|( on(?=\\s))|(Or )|(Are )|(In )|(Out )|(On )");
        Matcher matcher = prepositionsPattern.matcher(text);
        System.out.println(matcher.replaceAll(""));
        return matcher.replaceAll("");

    }

}
