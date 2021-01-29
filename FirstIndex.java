import java.io.*;
import java.util.*;
public class FirstIndex {
    public static void main(String[]args)throws Exception{
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        int d=s.nextInt();
        int Fi=firstindex(arr,0,d);
        System.out.println(Fi);
    }
    public static int firstindex(int []arr,int index,int x){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==x){
            return index;
        }
        else{
            int fiisa=firstindex(arr,index+1,x);
            return fiisa;
        }
    }
}
