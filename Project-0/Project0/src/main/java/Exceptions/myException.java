package Exceptions;

public class myException extends Exception{
    public myException(String message){
        super(message);
    }
    public myException(){
        super("ERROR");
    }
}
