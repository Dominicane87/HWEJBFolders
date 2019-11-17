package web;
import java.io.File;
import javax.ejb.Stateless;

@Stateless
public class FolderService {
    static StringBuilder stringBuilder=new StringBuilder();
    static File path=new File("C:\\MASA_2018_G1");

    public static File getPath() {
        return path;
    }

    public static String getFolders(File path) {
        if (path.isDirectory()) {
            stringBuilder.append("<ul>");
            stringBuilder.append("<li>").append(path.getName()).append("</li>");
            if (path.listFiles() != null) {
                File files[] = path.listFiles();
                for (File dirOrFile : files) {
                    getFolders(dirOrFile);
                }
            }
            stringBuilder.append("</ul>");
        }
        return stringBuilder.toString();
    }
}


