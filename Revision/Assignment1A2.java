import java.util.*;
class Assignment1A2{
  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);  
int n;    
      LinkedList ls = new LinkedList();
        
      ls.add("Red");
      ls.add("blue");
      ls.add("yellow");
      ls.add("orange");
      
    do{
      System.out.println("1.Display the contents of the List using an Iterator");
      System.out.println("2.Display the contents of the List in reverse order usint a ListIteraror");
      System.out.println("3.nsert the elements of this list between blue and yellow.");
      
      System.out.println("Enter your choice = ");
       n=sc.nextInt();
      switch(n)
      {
      case 1 : 
              Iterator i=ls.iterator();
              while(i.hasNext())
              {
                  System.out.println(i.next());
              }
              break;
      case 2 :
              ListIterator ls1=ls.listIterator(ls.size());
              while(ls1.hasPrevious())
              {
                System.out.println(ls1.previous());
              }
              break;
      case 3 :
                LinkedList ll1=new LinkedList();
                ll1.add("Pink");
                ll1.add("green");
                ls.add(2,ll1);
                System.out.println(ls);
                break;
      default:
            System.out.println("Invalid choice");
      }
  }while(n!=4);
}
}

    

