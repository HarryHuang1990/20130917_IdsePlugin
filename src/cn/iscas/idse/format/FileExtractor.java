package cn.iscas.idse.format;

/**
 * An interface for file extracting, which is used to extract text from various formats of file.
 * The implementation of each format can be constructed by the class FileExtractorFactory
 */
public interface FileExtractor {
	/**
	 * get the content of text from the file of specific format.
	 * @return
	 */
	public String getContent();
	
}
