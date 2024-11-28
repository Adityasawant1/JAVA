import java.util.*;
import java.sql.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
class Assignment4A1{
public static void main(String args[]){
    JFrame frame=new JFrame("Student Details");
    frame.setDefaultCloseOperation(3);
    frame.setSize(500,500);
    
    DefaultTableModel tableModel=new DefaultTableModel();
    JTable table=new JTable(tableModel);
    
    tableModel.addColumn("Roll Number");
    tableModel.addColumn("Name");
    tableModel.addColumn("Percentage");

    try{
      Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/STUDENT","root","");
      
      Statement stmt=cn.createStatement();
      ResultSet rs=stmt.executeQuery("Select * from Student");
      
      while(rs.next()){
        int rollno=rs.getInt("rollnumber");
        String name=rs.getString("name");
        double percentage=rs.getDouble("percentage");
        tableModel.addRow(new Object[]{rollno,name,percentage});
      }
      cn.close();
      }catch(SQLException e)
      {
            e.printStackTrace();
      }
      JScrollPane scrollpane=new JScrollPane(table);
      frame.add(scrollpane,BorderLayout.CENTER);
      frame.setVisible(true);
  }
}
