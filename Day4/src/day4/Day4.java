/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4;

/**
 *
 * @author macstudent
 */
public class Day4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String str1 = "Hello World";
       String str2 = new String ("Lambton College");
       String str3 = new String();
       String str4 = null;
       System.out.println(str1);
       str1 = str1.toUpperCase();
       System.out.println(str1);
       System.out.println(str1.contains("0"));
       System.out.println(str1.indexOf("WORLD"));
       System.out.println(str3.isEmpty());
//       System.out.println(str4.isEmpty());
if (str4!= null && str4.length() !=0 && !str4.isEmpty())
{
System.out.println( "A" + str4);
}
      
//      {if ( str4.length() !=0 && !str4.isEmpty() && str4 != null)
//      System.out.println(str4);
//      }
      System.out.println(str1.substring(5));
      System.out.println(str1.substring(5));
      String findStr = "College";
      if (str2.contains(findStr))
      {
          int startIndex = str2.indexOf(findStr);
          System.out.println(startIndex);
          
      String collegeStr =str2.substring(startIndex,startIndex +findStr.length());
//      System.out.println(collegeStr);
      }
      StringBuilder sb = new StringBuilder("Start--");
      System.out.println(sb);
      sb.append("2-City of Toronto");
      sb.append("2- Lambton College");
      System.out.println(sb);
    String str5 = sb.toString();
    Day4 m1 = new Day4();
    m1.matrix();
//    String.out.println(str5);
    }
    public void matrix()
    {
        int n = 5;
        int i,j,pos; 
    
        int a[][] = new int[n][n];
        int cnt = 1;
        int tempN =n;
        pos = 0;
        while(cnt <= (tempN * tempN))
        {
        for(i=j = pos ; j<n;a[i][j]= cnt++,j++);
        for(i++,j-- ; i<n;a[i][j]= cnt++,i++);
        for( i--,j--; j>=pos;a[i][j]= cnt++,j--);
        for( i--,j++; i>pos; a[i][j]= cnt++,i--);
        pos++;
        n--;
        
    }
        for (i=0; i<tempN;i++)
        {
        System.out.println();
        for (j=0;j<tempN; j++)
        {
          System.out.print(String.format("%3d", a[i][j]));
        }
        }

}
}