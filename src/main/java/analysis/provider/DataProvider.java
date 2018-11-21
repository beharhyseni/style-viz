package analysis.provider;

import java.io.IOException;


public interface DataProvider {

    /**
     * Read data source as string
     *
     * @return  string containing data read from source
     * @throws IOException  when error occurs reading from source
     */
    String dataSourceToString() throws IOException;
}
