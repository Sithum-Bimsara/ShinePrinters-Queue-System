public class PrintJob {
    private String fileName;
    private String fileType;

    public PrintJob(String fileName, String fileType) {
        this.fileName = fileName;
        this.fileType=fileType;

    }

    public String getFileName() {
        return fileName;
    }

    public String getFileType() {
        return fileType;
    }

}
