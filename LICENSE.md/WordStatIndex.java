import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

class Main
{
    private static Map<String, Integer> ListOfWord = new LinkedHashMap<String,Integer>();
    public static void main (String[] args) throws IOException {
        String in /*= "C:\\Users\\klim\\IdeaProjects\\first\\src\\in.txt"*/;
        String out /*= "C:\\Users\\klim\\IdeaProjects\\first\\src\\out.txt"*/;

        System.out.println("Name and way of InFile:");
        BufferedReader read = new BufferedReader( new InputStreamReader (System.in));
        in = read.readLine();
        System.out.println("Name and way of OutFile");
        out = read.readLine();
        BufferedReader reader = null;
        try
        {
            reader = new BufferedReader(new InputStreamReader( new FileInputStream(in), "UTF-8"));
        } catch (FileNotFoundException ex)
        {
            System.out.println("File not found.");
        } catch (UnsupportedEncodingException ex)
        {
            System.out.println("only  UTF-8");
        }



        try
        {
            String readStr = reader.readLine();
            while(readStr != null)
            {
                    counter(readStr);
                    readStr = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("error");
        }
        BufferedWriter write = null;
        try
        {
            write = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(out), "UTF-8"));
        } catch (FileNotFoundException ex)
        {
            System.out.println("file not dound");
        }catch (UnsupportedEncodingException ex)
        {
            System.out.println("only  UTF-8");
        }
        try
        {
            for(Map.Entry<String,Integer> elem : ListOfWord.entrySet()) {
                write.append(elem.getKey()+ ":" + elem.getValue()+"\r\n");
            }
            write.close();
        } catch (IOException e) {
            System.out.println("error");
        }
    }

    public static void counter(String str)
    {
        String[] splitStr = str.split(" ");
        for(String word: splitStr)
        {
            word = word.toLowerCase();
            if(word.length() > 0)
            {
                ListOfWord.put(word, ListOfWord.getOrDefault(word,0)+1);
            }
        }
    }


}