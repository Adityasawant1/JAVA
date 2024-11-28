import java.util.*;
class myth implements Runnable{
  int n;
  String name;
  Thread t;
  myth(int n,String name)
  {
    this.n=n;
    this.name=name;
    t=new Thread(this);
    t.start();
  }
  public void run(){
  try{
      for(int i=1;i<=n;i++)
      {
          System.out.println("I am in "+name+","+i);
          Thread.sleep(500);
      }
  }catch(InterruptedException e){
    System.out.println(e);
  }
  System.out.println("Exitsting ****");
}
}
class Assignment2A3{
  public static void main(String args[])throws Exception
  {
    myth t1=new myth(10,"FY");
    t1.t.join();
    myth t2= new myth(20,"SY");
    t2.t.join();
    myth t3=new myth(20,"TY");
    t3.t.join();
    System.out.println("Main Thread Existing");
  }
}

