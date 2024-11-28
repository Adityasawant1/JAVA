import java.util.*;
class myth extends Thread{
  int s,l;
  int a[];
  myth(int s,int l,int a[])
  {
    this.s=s;
    this.l=l;
    this.a=a;
  }
  public void run()
  {
    int sum=0;
    float avg=0.0f;
    for(int i=s;i<=l;i++)
    {
      sum+=a[i];
      avg=sum/(l-s+1);
    }
    System.out.println("Sum of Index : "+sum);
    System.out.println("Average of Index : "+avg);
  }
}
class Assignment2A2{
  public static void main(String args[])
  {
    Random r=new Random();
    int a[]=new int[1000];
    for(int i=0;i<1000;i++){
      a[i]=r.nextInt(100);
    }
    System.out.print("{");
    for(int i=0;i<1000;i++){
      System.out.print(a[i]+",");
    }
    System.out.println("}");
    myth[] t=new myth[10];
    int start=0;  
    int end=99; 
    int j=10;
    for(int i=0;i<10;i++){
      t[i]=new myth(start,end,a);
      start+=j;
      end+=j;
    }
    try{
      for(int i=0;i<10;i++){
        t[i].start();
        Thread.sleep(1000);
        t[i].join();
      }
    }catch(Exception e){}
    System.out.println("******* ****** Main thread ****** ********");
  }
}
        


