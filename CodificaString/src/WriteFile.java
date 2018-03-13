import java.io.FileWriter;

public class WriteFile
{
    private String nameFile;
    private FileWriter out;
    WriteFile(String nameFile)
            throws Exception
    {
        this.nameFile = nameFile;
        Initialization();
    }
    private void Initialization()
            throws Exception
    {
        out = new FileWriter(nameFile);
    }
    public void Write(String writeString)
            throws Exception
    {
        out.write(writeString);
    }
    private void Close()
            throws Exception
    {
        out.close();
    }
}
