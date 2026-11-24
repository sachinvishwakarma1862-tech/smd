package mypack;
public class message{
public void display(){
System.out.println("Welcome to Java packages");
}
}   
import mypack.Message;
public static void main(String[]args){
Message m = new Message();
m.display();
}
}
