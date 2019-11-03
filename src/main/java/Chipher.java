public interface Chipher {

    public byte[] encriptData(byte[] openText, byte[] key);
    public byte[] decriptData(byte[] openText, byte[] key);

}
