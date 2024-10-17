package com.atlassian.tutorial.macro;

import com.atlassian.confluence.macro.Macro;
import com.atlassian.confluence.macro.MacroExecutionException;
import com.atlassian.confluence.content.render.xhtml.ConversionContext;

import org.springframework.beans.factory.annotation.Autowired;
import com.atlassian.plugin.spring.scanner.annotation.imports.ComponentImport;
import com.atlassian.webresource.api.assembler.PageBuilderService;

import java.util.Map;

public class epamtestbutton implements Macro {
    private PageBuilderService pageBuilderService;

    @Autowired
    public epamtestbutton(@ComponentImport PageBuilderService pageBuilderService) {
        this.pageBuilderService = pageBuilderService;
    }

    public String execute(Map<String, String> map, String s, ConversionContext conversionContext) throws MacroExecutionException {
        pageBuilderService.assembler().resources().requireWebResource("com.atlassian.tutorial.epamTestButtonMacro:epamTestButtonMacro-resources");

        String text = map.get("Text");
        String color = map.get("Color");

        return "<button type=\"button\" class=\"epam-button epam-button--" + color + "\">" + text + "</button>";
    }

    public BodyType getBodyType() { return BodyType.NONE; }

    public OutputType getOutputType() { return OutputType.BLOCK; }
}
