import models.File;
import models.Folder;

public class Runner {

    public static void main(String[] args) {
        Folder folder_1;
        File file_1;
        File file_2;
        File file_3;
        File file_4;


        folder_1 = new Folder("Documents");

        file_1= new File("holidayPicture_01", ".jpg", 2003, folder_1);
        file_2= new File("retouched_holiday_pic", ".psd", 40120, folder_1);
        file_3= new File("CV Marcin", ".txt", 150, folder_1);
        file_4= new File("sysFile", ".cfg", 10, folder_1);



    }
}
