import java.io.FileWriter;

public class WriteFile
{
    private String nameFile;
    private FileWriter out;
    WriteFile(String nameFile)
            throws Exception
    {
        this.nameFile = nameFile;
        initialization();
    }
    private void initialization()
            throws Exception
    {
        out = new FileWriter(nameFile);
    }
    public void write(byte[] writeString)
            throws Exception
    {
        for(int i=0; i<writeString.length; i++)
            out.write(Integer.toBinaryString(writeString[i]));
        //out.write(Character.toString ((char) writeString[i]));
        close();
    }
    private void close()
            throws Exception
    {
        out.close();
    }
}
