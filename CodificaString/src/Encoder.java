public class Encoder
{
    private String encodeString;
    private byte startRange,endRange,randValue;
    public Encoder(byte startRange, byte endRange, byte randValue)
    {
        this.startRange = startRange;
        this.endRange = endRange;
        this.randValue = randValue;
    }
    public byte[] encode(byte[] inputData)
    {
        byte[] retVal = new byte[inputData.length];
        for(int i=0; i<inputData.length; i++){
            retVal[i] = encodeByte(inputData[i]);
        }
        return retVal;
    }
    private byte encodeByte(byte byteToEncode)
    {
        byte retVal = 0;
        int sum;
        int rangeLength;
        int reminder;
        sum = byteToEncode + randValue;
        rangeLength = endRange - startRange;
        reminder = sum % rangeLength;
        retVal = (byte) (startRange + reminder);
        return retVal;
    }
}
