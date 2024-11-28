import java.util.*;
class Assignment1A3{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    Hashtable<String,Float>hs=new Hashtable<>();
    System.out.println("Enter No of Student = ");
    int n=sc.nextInt();
    System.out.println("Enter the name and percentage of Student ");
    for(int i=0;i<n;i++)
    {
      hs.put(sc.next(),sc.nextFloat());
    }
    System.out.println(hs);
    System.out.println("Enter element to search ");
    String s=sc.next();
    if(hs.containsKey(s)) 
    {
      System.out.println("Percentage of "+s+" is "+hs.get(s));
    }
    else 
        System.out.println("Key not found");
  }
}
    
