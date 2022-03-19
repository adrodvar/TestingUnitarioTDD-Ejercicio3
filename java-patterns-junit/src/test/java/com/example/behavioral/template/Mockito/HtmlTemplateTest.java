package com.example.behavioral.template.Mockito;

import com.example.behavioral.template.HtmlAboutUs;
import com.example.behavioral.template.HtmlHome;
import com.example.behavioral.template.HtmlTemplate;
import com.example.behavioral.template.Prueba;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class HtmlTemplateTest {

    @Mock
    HtmlHome mock = new HtmlHome();

    @InjectMocks
    HtmlTemplate home = new HtmlHome();

    @Test
    void validateHtmlRespurce() {
        HtmlTemplate template = new HtmlHome();
        //when(mock.renderTo()).thenReturn(template.renderTo());
        verify(mock.render("a","a","a"));
    }

}