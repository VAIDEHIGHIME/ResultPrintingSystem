package Classes;

import java.io.FileInputStream;
import java.io.IOException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Course
{
    private Workbook getWorkbook(String FilePath) throws BiffException, IOException
    {
        FileInputStream fs = new FileInputStream(FilePath);
        Workbook wb = Workbook.getWorkbook(fs);
        return(wb);
        
    }
    public int getCourseCredit(String courseCode,String FilePath) throws BiffException, IOException
    {
        int CourseCredit=0;
        Workbook wb=getWorkbook(FilePath);
       
        // TO get the access to the sheet
        Sheet sh = wb.getSheet(0);
       
        int totalNoOfRows = sh.getRows();
        int flag=0;
        int row =0;
        if(courseCode==null)
        {
            CourseCredit=0;
        }
        else{
            while(row<totalNoOfRows && flag==0)
            {
                if(courseCode.equals(sh.getCell(0,row).getContents()))
                {

                    flag=1;       
                    CourseCredit=Integer.parseInt(sh.getCell(2,row).getContents());

                }
                row++;
            }
            if(flag==0)
            {
                CourseCredit=0;
            } 
        }

        
        
        return(CourseCredit);
        
        
                      
    }
    public String getCourseName(String courseCode,String FilePath) throws BiffException, IOException
    {
        
        String CourseName = null;
        Workbook wb=getWorkbook(FilePath);

        // TO get the access to the sheet
        Sheet sh = wb.getSheet("Course");

        // To get the number of rows present in sheet
        int totalNoOfRows = sh.getRows();

       

        int flag=0;
        int row =0;
        if(courseCode==null)
        {
            CourseName="CourseNotApplied";
        }
        else{
            while(row<totalNoOfRows && flag==0)
            {
                if(courseCode.equals(sh.getCell(0,row).getContents()))
                {

                    flag=1;
                    CourseName=sh.getCell(1,row).getContents();
                }
                row++;
            }
            if(flag==0)
            {
                CourseName="Course not Found";
            }
        }
        
        return (CourseName);
    }
	
		
}