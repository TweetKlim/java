package src;

import java.util.List;

public class Strong  extends Paragraph
{
    Strong(List<Markdown> elements)
    {
        super(elements) ;
    }
    public void ToMarkdown(StringBuilder Instring)
    {
        Instring.append("__");
        super.ToMarkdown(Instring);
        Instring.append("__");
    }
}
