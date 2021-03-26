import java.util.*;
public class Main
{   
    public static ArrayList<String> arr = new ArrayList<String>();
    public static void permutation(String str,int count,int n){
        if(count == n){
            //System.out.println(str);
            arr.add(str);
            return;
        }
            char ch1 = str.charAt(count);
        for(int i = count;i < n;i++){
            StringBuffer st = new StringBuffer(str);
            char ch2 = str.charAt(i);
            st.setCharAt(count,ch2);
            st.setCharAt(i,ch1);
            String temp = st.toString();
            permutation(temp,count+1,n);
        }
    }
	public static void main(String[] args) {
	    long startTime = System.nanoTime();
		String str = "abc";
		permutation(str,0,str.length());
		System.out.println(arr);
		System.out.println(arr.size());
		long endTime = System.nanoTime();
		System.out.println(endTime - startTime);
	}
}
