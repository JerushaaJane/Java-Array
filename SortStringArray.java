import java.util.*;
public class SortStringArray {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);    
      String[]a=new String[3];
      for(int i=0;i<a.length;i++){
          a[i]=sc.nextLine();
      }
      //sort array
      for(int i=0;i<a.length;i++){
          for(int j=i+1;j<a.length;j++){
              if(a[i].compareTo(a[j])>0){
                  String temp=a[i];
                  a[i]=a[j];
                  a[j]=temp;
              }
          }
      }
      for(int i=0;i<a.length;i++){System.out.println(a[i]);}
    }
}
