public class Simulator
{
    private String stringRead;
    private byte StringEncrypted[];
    private int randVal;
    private char startRange,endRange;
    private Generator generator;
    private Encoder encoder;
    Simulator()
    {
        stringRead = "";
        startRange = 0;
        endRange = 0;
        randVal = 0;
        generator = new StdGenerator(Constants.maxNumberGenerate);
    }
    private void findMinMaxAsciiInterval()
    {
        startRange = endRange = stringRead.charAt(0);
        for(int i=1; i<stringRead.length(); i++){
            if(stringRead.charAt(i) > endRange){
                endRange = stringRead.charAt(i);
            }
            if(stringRead.charAt(i) < startRange){
                startRange = stringRead.charAt(i);
            }
        }
    }
    public void read()
            throws Exception
    {
        ReadFile readFile = new ReadFile(Constants.fileInputName);
        stringRead = readFile.execute();
    }
    public void simulate()
    {
        StringEncrypted = new byte[stringRead.length()];
        findMinMaxAsciiInterval();
        randVal = generator.next();
        encoder = new Encoder((byte)startRange,(byte)endRange,(byte)randVal);
        byte[] bytesFromStringRead = stringRead.getBytes();
        StringEncrypted = encoder.encode(bytesFromStringRead);
    }
    public void write()
            throws Exception
    {
        WriteFile writeFile = new WriteFile(Constants.fileOutputName);
        writeFile.write(StringEncrypted);
    }
}
