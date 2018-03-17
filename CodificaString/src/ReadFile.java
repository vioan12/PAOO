import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFile
{
    private String nameFile;
    private FileReader in;
    private BufferedReader br;
    private String readString;
    ReadFile(String nameFile)
            throws Exception
    {
        this.nameFile = nameFile;
        initialization();
    }
    private void initialization()
            throws Exception
    {
        readString = "";
        in = new FileReader(nameFile);
        br = new BufferedReader(in);
    }
    private void close()
            throws Exception
    {
        in.close();
        br.close();
    }
    public String execute()
            throws Exception
    {
        String line;
        while((line = br.readLine()) != null){
            readString = readString + line;
        }
        close();
        return readString;
    }
}
