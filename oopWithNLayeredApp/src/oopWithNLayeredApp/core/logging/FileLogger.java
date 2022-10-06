package oopWithNLayeredApp.core.logging;

public class FileLogger implements Logger{
    public void log(String data){
        System.out.println("The file has logged: "+ data);
    }
}
