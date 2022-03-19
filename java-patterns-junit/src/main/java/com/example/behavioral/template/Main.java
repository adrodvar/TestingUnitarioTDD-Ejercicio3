package com.example.behavioral.template;

public class Main {

    public static void main(String[] args) {

        HtmlHome home = new HtmlHome();
        String head= "";
        String body = "body";
        String footer="footer";
        System.out.println(home.render(head,  body,  footer));

        HtmlAboutUs about = new HtmlAboutUs();
        System.out.println(about.render(head,  body,  footer));
    }
}
