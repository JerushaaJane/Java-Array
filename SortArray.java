import java.util.*;
public class SortArray {
    public static void main(String args[]) {
      int[]a={2,3,1,10,9};
      for(int i=0;i<a.length;i++){
          for(int j=i+1;j<a.length;j++){
              if(a[j]<a[i]){
                  int temp=a[j];
                  a[j]=a[i];
                  a[i]=temp;
              }
          }
      }
      
      for(int i=0;i<a.length;i++){System.out.println(a[i]);}
    }
}
