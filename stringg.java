import java.lang.*;
class stringg
{
public static void main(String args[])
{
String s1="Jai Ganesh";
String s7="JAI GANESH";
 String s2="Ganpati Bappa Morya";
String s3="Hello";
String s6="Hello";
String s4="Java";


System.out.println("*********-- creating a string --*********");
System.out.println("String is : " +s1);
System.out.println("String is : " +s2);
System.out.println("String is : " +s3);
System.out.println("\n");

System.out.println("*********-- charAt Function --*********");
char ch=s1.charAt(5);
System.out.println("String is : "+s1);
System.out.println("Char At 5 :" +ch );
System.out.println("\n");

System.out.println("*********-- compareTo Function --*********");

System.out.println(s1.compareTo(s2));
System.out.println(s1.compareTo(s3));
System.out.println(s2.compareTo(s3));
System.out.println(s2.compareTo(s1));
System.out.println("\n");

System.out.println("*********-- concat Function --*********");
System.out.println("String s3 : "+s3);
System.out.println("String s3 : "+s4);
String str= s3.concat(s4);  
System.out.println("concat s3 with s4 :  "+str);        

System.out.println("\n");

System.out.println("*********-- contains Function --*********");
String s5="Welcome To The World Of Java";
System.out.println("string s5 : " + s5);
System.out.println("s5 contais Welcome :   "+s5.contains("Welcome"));
System.out.println("s5 contais java :    "+s5.contains("java"));
System.out.println("s5 contais World :   "+s5.contains("World"));
System.out.println("s5 contais the :"+s5.contains("the"));
System.out.println("\n");


System.out.println("*********-- endsWith Function --*********");
System.out.println("string s1 : "+s1);
System.out.println("s1 ends with h :"+s1.endsWith("h"));
System.out.println("s1 ends with Java:"+s1.endsWith("Java"));
System.out.println("\n");

System.out.println("*********--  equals Function --*********");
System.out.println("string s1 ="+s1);
System.out.println("string s7 ="+s7);
System.out.println("string s6 ="+s6);
System.out.println("string s3 ="+s3);
System.out.println("s1 equals s7 : "+s1.equals(s7));
System.out.println("s6 equals s3 : "+s6.equals(s3));
System.out.println("\n");

System.out.println("*********--  equalsIgnoreCase Function --*********");
System.out.println("Ignore Case of s1 , s7 , s6 , s3 ");
System.out.println("string s1 : "+s1);
System.out.println("string s3 : "+s3);
System.out.println("string s6 : "+s6);
System.out.println("string s7: "+s7);
System.out.println("After Ignoring Case s1 equals s7 : ");
System.out.println(s1.equalsIgnoreCase(s7));
System.out.println("After Ignoring Case s6 equals s3 : ");
System.out.println(s6.equalsIgnoreCase(s3));
System.out.println("\n");

System.out.println("*********--  format Function --*********");
String name="golyaa";
String sf1=String.format("name is %s",name);  
String sf2=String.format("value is %f",32.33434);  
String sf3=String.format("value is %32.12f",32.33434);
System.out.println(sf1);  
System.out.println(sf2);  
System.out.println(sf3);
System.out.println("\n");

System.out.println("*********--  getBytes Function --*********");
System.out.println("Get Bytes Of : "+s1); 
 byte[] barr = s1.getBytes();
for(int i=0;i<barr.length;i++){  
            System.out.println(barr[i]);  
        }  
System.out.println("\n");



System.out.println("*********--  getChars Function --*********");
System.out.println("Print chars of : "+s2);
 char[] c = new char[10];  
      try{  
         s2.getChars(1, 26, c, 0);  
         System.out.println(c);  
      }catch(Exception ex)
{
System.out.println(ex);
 } 
System.out.println("\n");

System.out.println("*********--  indexOf Function --*********");
System.out.println("string s1 : "+s1);
System.out.println("string s2 : "+s2);
int index1=s1.indexOf("Jai");
int index2=s2.indexOf("Bappa");
System.out.println("index of  Jai :  "+index1);
System.out.println(" \n index of  Bappa :  "+index2);
System.out.println("\n");

System.out.println("*********--  isEmpty Function --*********");

String s8="";
System.out.println(s1+"  is empty :"+s1.isEmpty());
System.out.println(s8+"  is empty :"+s8.isEmpty());
System.out.println(s3+"  is empty :"+s3.isEmpty());
System.out.println(s2+"  is empty :"+s2.isEmpty());
System.out.println(s4+"  is empty :"+s4.isEmpty());
System.out.println(s5+"  is empty :"+s5.isEmpty());
System.out.println(s6+"  is empty :"+s6.isEmpty());
System.out.println(s7+"  is empty :"+s7.isEmpty());
System.out.println("\n");

System.out.println("*********-- join Function --*********");
System.out.println("Join the '-' in sentence welcome to the world of java \n");
String s9=String.join("-","welcome","to","the","world","of","java");
System.out.println(s9);
System.out.println("\n");


System.out.println("*********-- lastIndexOf Function --*********");
System.out.println("Last Index of ' a ' in " + s1);
int i1=s1.lastIndexOf('a');
System.out.println(i1);
System.out.println("\n");

System.out.println("*********-- lengthFunction --*********");
System.out.println("string length of "+s1 +" :  "+s1.length());
System.out.println("string length of "+s2 +" :  "+s2.length());
System.out.println("string length of "+s3 +" :  "+s3.length());
System.out.println("string length of "+s4 +" :  "+s4.length());
System.out.println("string length of "+s5 +" :  "+s5.length());
System.out.println("string length of "+s6 +" :  "+s6.length());
System.out.println("string length of "+s7 +" :  "+s7.length());
System.out.println("\n");


System.out.println("*********--  replace Function --*********");
System.out.println("Replace ' e ' with ' a ' in : " +s4);
String replaceString=s4.replace('a','e');
System.out.println("After Replacing :    " +replaceString); 
System.out.println("\n");


System.out.println("*********--  replaceAll Function --*********");
System.out.println("Replace All ' e ' with ' a ' in : " +s2);
String replaceStringg=s2.replace('a','e');
System.out.println("After Replacing :    " +replaceStringg); 
System.out.println("\n");


System.out.println("*********--  split Function --*********");
String s="java string split method";  
System.out.println("Split the string : "+s);
String[] words=s.split("\\s");
for(String w:words){  
System.out.println("\n");
System.out.println(w); 
System.out.println("\n");
}
System.out.println("*********--  startsWith Function --*********");
System.out.println("string s1 : "+s1);
System.out.println("string s2 : "+s2);
System.out.println("string s3 : "+s3);
System.out.println("\n");
System.out.println("s1 starts with J :"+s1.startsWith("J"));
System.out.println("s2 starts with G :"+s2.startsWith("G"));
System.out.println("s3 starts with h :"+s3.startsWith("h"));
System.out.println("\n");



System.out.println("*********--  substring Function --*********");
System.out.println("Substing of "+s1+"  from 0 to 5  :  ");
System.out.println(s1.substring(0,5));
System.out.println("\n");

System.out.println("*********--  toCharArray Function --*********");

        char[] chh = s2.toCharArray();  
int len=chh.length;
        System.out.println("Char Array elements of : " +s2);  
        for (int j = 0; j < len; j++) {  
            System.out.println(chh[ j ]);  
        }  
System.out.println("\n");
System.out.println("*********-- toLowerCase Function --*********");
System.out.println(s1 + " to lower case :  "+s1.toLowerCase());
System.out.println(s2 + " to lower case :  "+s2.toLowerCase());
System.out.println(s3 + " to lower case :  "+s3.toLowerCase());
System.out.println(s4 + " to lower case :  "+s4.toLowerCase());
System.out.println(s5 + " to lower case :  "+s5.toLowerCase());
System.out.println(s6 + " to lower case :  "+s6.toLowerCase());
System.out.println(s7 + " to lower case :  "+s7.toLowerCase());
System.out.println("\n");


System.out.println("*********-- toUpperCase Function --*********");
System.out.println(s1 + " to upper case :  "+s1.toUpperCase());
System.out.println(s2 + " to upper case :  "+s2.toUpperCase());
System.out.println(s3 + " to upper case :  "+s3.toUpperCase());
System.out.println(s4 + " to upper case :  "+s4.toUpperCase());
System.out.println(s5 + " to upper case :  "+s5.toUpperCase());
System.out.println(s6 + " to upper case :  "+s6.toUpperCase());
System.out.println(s7 + " to upper case :  "+s7.toUpperCase());
System.out.println("\n");


System.out.println("*********-- valueOf Function --*********");
boolean bol = true;    
 boolean bol2 = false;    
System.out.println("bol = "+bol);
System.out.println("bol2 = "+bol2);
System.out.println("Value of bol : ");
System.out.println("\n");
System.out.println(String.valueOf(bol));
System.out.println("Value of bol2 : ");
System.out.println(String.valueOf(bol2));
System.out.println("\n");
}
}
