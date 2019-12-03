import java.util.*;
import java.io.*;
import java.beans.*; 

public class HighScore
{
    public boolean addHighScore(String name, int min, int sec,int level)
    {
        try{   
            if(name!=null){
               String outData="PlayerName: "+name+" Total Time for Levels:"+min+":"+sec+ "(Minutes:Seconds)"+ "Level Reached:*" + level;
               PrintWriter out = new PrintWriter(new FileOutputStream("scores.txt",true));
               out.println("");
               out.println(outData);
               out.close();
               return true;
            }
            return false;
    }//prints the highscore data to scores.txt
        catch(Exception ex){
            System.out.println(ex);
       }//end catch
	return false;    
    }//end addHighScore   
}//end class

