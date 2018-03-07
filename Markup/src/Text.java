package src;
public class Text extends Paragraph
{
    private String savetext;

    Text(String InText)
    {
        savetext = InText;
    }

    public void ToMarkdown(StringBuilder Instring)
    {
        Instring.append(savetext);
    }
}
