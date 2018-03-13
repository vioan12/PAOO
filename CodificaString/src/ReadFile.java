import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFile
{
    private String nameFile;
    private String readString;
    private FileReader in;
    private BufferedReader br;
    ReadFile(String nameFile)
            throws Exception
    {
        this.nameFile = nameFile;
        Initialization();
        Execute();
        Close();
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
    private void execute()
            throws Exception
    {
        String line;
        while((line = br.readLine()) != null){
            readString = readString + line;
        }
    }
    public String getReadString()
    {
        return readString;
    }

}
