import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PickYourQuote {
  public static void main(String[] args) throws Exception {

    final String quotesFile = args[0];
    final int num = Integer.parseInt(args[1]);

    // read the file Quotes.txt using a BufferedReader
    FileReader r = new FileReader(quotesFile);
    BufferedReader someQuotes = new BufferedReader(r);

    //reformat the file
    reformat(num, someQuotes);

    someQuotes.close();
  }

  public static void reformat(int i, BufferedReader in) throws IOException {

    // read lines from the input
    // reformat as appropriate
    // print to specified quote to System.out

    int lineNum = 0;
    String line = in.readLine();
    lineNum++;

    while ((lineNum < i) && (line != null)) {
      line = in.readLine();
      lineNum++;
    }

    if ((line == null) && (lineNum > 1)) {
      System.out.println("Error: Quote number out of bounds.");
    } else {
      String[] parts = line.split(";", 2);
      for (String part : parts) {
        System.out.println(part);
      }
    }
  }
}




