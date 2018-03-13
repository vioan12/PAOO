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
    private void FindMinMaxAsciiInterval()
    {
        asciiMinValue = asciiMaxValue = encodeString.charAt(0);
        for(int i=1; i<encodeString.length(); i++){
            if(encodeString.charAt(i) > asciiMaxValue){
                asciiMaxValue = encodeString.charAt(i);
            }
            if(encodeString.charAt(i) < asciiMinValue){
                asciiMinValue = encodeString.charAt(i);
            }
        }
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
