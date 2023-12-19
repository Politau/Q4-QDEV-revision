package antipattern;
public class DataCompression {
    private DataCompressionStrategy compressionStrategy;

    public DataCompression(DataCompressionStrategy compressionStrategy) {
        this.compressionStrategy = compressionStrategy;
    }

    public void setCompressionStrategy(DataCompressionStrategy compressionStrategy) {
        this.compressionStrategy = compressionStrategy;
    }

    public String processData(Data data) {
        return compressionStrategy.processData(data);
    }





}
