public class Demo
{
public static void main(String[]args)
{
    Narendra narendra=new Narendra();
    Vijay vijay=new Vijay();

    Demo demo=new Demo();

     demo.PrintData(narendra, vijay);



}
 

void PrintData(Narendra narendra,Vijay vijay)
{
    narendra.name="Narendra";
    narendra.age=26;

System.out.println(narendra.name);
System.out.println(narendra.age);
       vijay.name="Vijay";
       vijay.age=24;
System.out.println(vijay.name);
System.out.println(vijay.age);

}

}
class Narendra
{
    String name;
    int age;
}
class Vijay
{
   String name;
    int age;

}