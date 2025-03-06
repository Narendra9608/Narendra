import java.io.*;
public class Person implements Serializable
{

int id;
String name;
public static void main(String[] args) throws Exception
{
Person p=new Person();
p.id=50;
p.name="Narendra";
System.out.println("=====serialization started======");
FileOutputStream fos=new FileOutputStream("Narendra.txt");
ObjectOutputStream oos=new ObjectOutputStream(fos);
oos.writeObject(p);
oos.flush();
oos.close();
System.out.println("=== Serialization ended ====");

System.out.println("===deserilization started====");
FileInputStream fis=new FileInputStream("Narendra.txt");
ObjectInputStream ois=new ObjectInputStream(fis);
Object object=ois.readObject();
Person p1=(Person) object;
System.out.println(p1.id);
System.out.println(p1.name);
ois.close();

System.out.println("De-serialization ended");

}

}