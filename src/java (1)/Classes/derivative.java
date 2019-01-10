package Classes;

public class derivative
{
    public String dcToDn(String dc)
    {
        if(null == dc)
            return("enter the dept");
        else switch (dc) {
            case "CSE":
                return("Computer Science and Engineering");
            case "ECE":
                return("Electronics and Communication and Engineering");
            default:
                return("enter the dept");
        }
    }
    public int semToyear(String sem)
    {
        if("1".equals(sem))
        {
            return(1);
                 
        }
        if("2".equals(sem))
        {
            return(1);
        }
        if("3".equals(sem))
        {
            return(2);
            
        }
        if("4".equals(sem))
        {
            return(2);
        }
        if("5".equals(sem))
        {           
            return(3); 
        }
        if("6".equals(sem))
        {
            return(3);
        }
        if("7".equals(sem))
        {
            return(4);
        }
        if("8".equals(sem))
        {
             return(4);
        }         
        else
        {    
            return (0);
        }
    }
    public int gradeToGradePoint(String grade)
    {
        if("AA".equals(grade))
        {
            return(10);
        }
        if("AB".equals(grade))
        {
            return(9);
        }
        if("BB".equals(grade))
        {
            return(8);
        } 
        if("BC".equals(grade))
        {
            return(7);
        } 
        if("CC".equals(grade))
        {
            return(6);
        } 
        if("CD".equals(grade))
        {
            return(5);
        }   
        if("DD".equals(grade)){
            return(4);
        }
        else
        {
            return(0);
        }
    }
}
