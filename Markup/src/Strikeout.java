package src;

import java.util.List;

public class Strikeout extends Paragraph
{
    Strikeout(List<Markdown> elements)
    {
        super(elements) ;
    }
    public void ToMarkdown(StringBuilder Instring)
    {
        Instring.append("~");
        super.ToMarkdown(Instring);
        Instring.append("~");
    }
}
