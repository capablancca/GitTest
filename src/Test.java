import java.io.File;

public class Test {
    public static int fun(String fileName){

        File f = new File(fileName);
        File[] fileArr = f.listFiles();
        if(fileArr==null || fileArr.length ==0){
            return 0;
        }
        int fileCount = 0;
        for(int i=0;i<fileArr.length;i++){
            if(fileArr[i].isDirectory()){
                int count = fun(fileName+"\\"+fileArr[i].getName());
                if(count==0){
                    String fName = fileArr[i].getName();
                    boolean check = fileArr[i].delete();
                }
            }
            else{
                fileCount++;
            }
        }
        return fileCount;
    }
    public static void main(String[] args) {
        fun("D:\\A");
    }
}
