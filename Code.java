# Code
import java.io.*;
import java.util.*;
public class Code 
{
public static void main(String args[])
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String str="code";
	String str2="kata";
	char ch[]=str.toCharArray();
	char ch2[]=str2.toCharArray();
	int temp;
	for(int i=0;i<str.length();i++)
  {
		temp=ch[i]+10;
		ch[i]=(char)temp;
	}
	for(int i=0;i<str2.length();i++)
	{
		if(i>0&&i<str2.length()-1)
		{
			temp=ch2[i]+10;
			ch2[i]=(char)temp;
		if(ch2[i]>122||(ch2[i]<97&&ch2[i]>90))
		{
			temp=ch2[i]-26;
			ch2[i]=(char)temp;
		}
		}
		else
		ch2[i]=ch2[i];
	}
	str=String.valueOf(ch);
	str2=String.valueOf(ch2);
	System.out.println(str+" "+str2);
}
}
