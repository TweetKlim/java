package src ;

import java.util.List;

public class Paragraph implements Markdown {
    private List<Markdown> components;

    Paragraph() {
    }

    Paragraph(List<Markdown> elements) {
        this.components = elements;
    }


    public void ToMarkdown(StringBuilder Instring) {
        for (int i = 0; i < components.size(); i++) {
            components.get(i).ToMarkdown(Instring);
        }
    }
}
