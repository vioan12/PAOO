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
    private void Initialization()
            throws Exception
    {
        readString = "";
        in = new FileReader(nameFile);
        br = new BufferedReader(in);
    }
    private void Close()
            throws Exception
    {
        in.close();
        br.close();
    }
    private void Execute()
            throws Exception
    {
        readString = br.readLine();
    }
    public String GetReadString()
    {
        return readString;
    }

}
