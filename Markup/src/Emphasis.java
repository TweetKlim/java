package src;

import java.util.List;

public class Emphasis extends Paragraph
{
    Emphasis(List<Markdown> elements)
    {
        super(elements) ;
    }
    public void ToMarkdown(StringBuilder Instring)
    {
        Instring.append("*");
        super.ToMarkdown(Instring);
        Instring.append("*");
    }

}
